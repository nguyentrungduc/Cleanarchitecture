package com.example.cleanarchitecture.platform

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.cleanarchitecture.extension.setupSnackbar
import com.example.cleanarchitecture.navigation.NavigationCommand
import com.google.android.material.snackbar.Snackbar

abstract class BaseFragment : Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        observeNavigation(getViewModel())
        setupSnackbar(this, getViewModel().snackBarError, Snackbar.LENGTH_LONG)

        // This callback will only be called when MyFragment is at least Started.
        val callback = object : OnBackPressedCallback(true /** true means that the callback is enabled */) {
            override fun handleOnBackPressed() {
                onBackPressed()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback);
    }

    open fun onBackPressed() {}

    abstract fun getViewModel(): BaseViewModel

    /**
     * Observe a [NavigationCommand] [Event] [LiveData].
     * When this [LiveData] is updated, [Fragment] will navigate to its destination
     */
    private fun observeNavigation(viewModel: BaseViewModel) {
        viewModel.navigation.observe(viewLifecycleOwner, Observer {
            it?.getContentIfNotHandled()?.let { command ->
                when (command) {
                    is NavigationCommand.To -> findNavController().navigate(
                        command.directions,
                        getExtras()
                    )
                    is NavigationCommand.Back -> findNavController().navigateUp()
                }
            }
        })
    }

    /**
     * [FragmentNavigatorExtras] mainly used to enable Shared Element transition
     */
    open fun getExtras(): FragmentNavigator.Extras = FragmentNavigatorExtras()
}

