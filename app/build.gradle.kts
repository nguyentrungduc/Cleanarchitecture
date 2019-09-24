plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.navigationSafeArgs)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        applicationId = "com.example.cleanarchitecture"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    dataBinding {
        isEnabled = true
    }
}


dependencies {

    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)

    // Room Library
    kapt(Libraries.roomComplier)
    implementation(Libraries.roomLib)
    implementation(Libraries.roomExtension)
    implementation(Libraries.roomGuava)
    implementation(Libraries.roomRx)

    // Rx
    implementation(Libraries.rxJava)
    implementation(Libraries.rxAndroid)
    implementation(Libraries.rxKotlin)

    // Navigation
    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigationUI)

    // Paging
    implementation(Libraries.paging)
    implementation(Libraries.pagingRx)
    testImplementation(TestLibraries.testPaging)

    // Coil
    implementation(Libraries.coil)

    // Coroutines
    implementation(Libraries.coroutines)

    // Koin
    implementation(Libraries.koinScope)
    implementation(Libraries.koinViewmodel)
    implementation(Libraries.koinAndroidX)

    // Test
    testImplementation(TestLibraries.junit4)
    testImplementation(TestLibraries.testRoom)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.espresso)

}
