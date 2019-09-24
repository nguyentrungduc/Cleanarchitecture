const val kotlinVersion = "1.3.50"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.5.0"

        const val navigationVersion = "2.1.0"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    const val kotlinKapt = "kotlin-kapt"

    const val kotlinAndroid = "kotlin-android"

    const val androidApplication = "com.android.application"

    const val kotlinAndroidExtensions = "kotlin-android-extensions"

    const val navigationSafeArgs = "androidx.navigation.safeargs"
    const val navigationGradlePlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"

}

object AndroidSdk {
    const val min = 15

    const val compile = 28

    const val target = compile
}

object Libraries {

    private object Versions {
        const val jetpack = "1.0.0"

        const val constraintLayout = "1.1.3"

        const val ktx = "1.1.0"

        const val room = "2.2.0-rc01"

        const val rxJava = "2.2.12"

        const val rxAndroid = "2.1.1"

        const val rxKotlin = "2.4.0"

        const val navigation = "2.1.0"

        const val coil = "0.7.0"

        const val coroutines = "1.3.1"

        const val koin = "2.0.1"

        const val paging = "2.1.0"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"

    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"

    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"

    const val roomLib = "androidx.room:room-runtime:${Versions.room}"
    const val roomComplier = "androidx.room:room-compiler:${Versions.room}"
    const val roomExtension = "androidx.room:room-ktx:${Versions.room}"
    const val roomRx = "androidx.room:room-rxjava2:${Versions.room}"
    const val roomGuava = "androidx.room:room-guava:${Versions.room}"

    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"

    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    const val coil = "io.coil-kt:coil:${Versions.coil}"

    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"

    const val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    const val koinViewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val koinAndroidX = "org.koin:koin-androidx-ext:${Versions.koin}"

    const val paging = "androidx.paging:paging-runtime:${Versions.paging}"
    const val pagingRx = "androidx.paging:paging-rxjava2:${Versions.paging}"
}

object TestLibraries {

    private object Versions {

        const val junit4 = "4.12"

        const val testRunner = "1.2.0"

        const val espresso = "3.2.0"

        const val room = "2.2.0-rc01"

        const val paging = "2.1.0"

    }

    const val junit4 = "junit:junit:${Versions.junit4}"

    const val testRunner = "androidx.test:runner:${Versions.testRunner}"

    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    const val testRoom = "androidx.room:room-testing:${Versions.room}"

    const val testPaging = "androidx.paging:paging-common:${Versions.paging}"
}