import Secrets.NY_TIMES_API_KEY

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(Sdk.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(Sdk.MIN_SDK_VERSION)
        targetSdkVersion(Sdk.TARGET_SDK_VERSION)

        buildConfigField("String", "NY_TIMES_API_KEY", "\"$NY_TIMES_API_KEY\"")

        applicationId = AppCoordinates.APP_ID
        versionCode = AppCoordinates.APP_VERSION_CODE
        versionName = AppCoordinates.APP_VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
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

    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))

    implementation(SupportLibs.ANDROIDX_APPCOMPAT)
    implementation(SupportLibs.ANDROIDX_CONSTRAINT_LAYOUT)
    implementation(SupportLibs.ANDROIDX_CORE_KTX)
    implementation(SupportLibs.ANDROIDX_FRAGMENT_KTX)
    implementation(SupportLibs.ANDROIDX_VIEW_MODEL)
    implementation(SupportLibs.ANDROIDX_LIVE_DATA)
    implementation(SupportLibs.ANDROIDX_VIEW_MODEL_STATE)
    implementation(SupportLibs.ANDROIDX_NAVIGATION_FRAGMENT)
    implementation(SupportLibs.ANDROIDX_NAVIGATION_UI)
    implementation(SupportLibs.DAGGER_HILT)
    implementation(CoroutineLibs.COROUTINE)
    implementation(ImageLoadingLibs.COIL)
    implementation(NetworkLibs.RETROFIT)
    implementation(NetworkLibs.GSON)
    implementation(NetworkLibs.RETROFIT_GSON_CONVERTER)
    debugImplementation(NetworkLibs.LOGGING_INTERCEPTOR)

    kapt(Kapts.ANDROIDX_LIFECYCLE_COMPILER)
    kapt(Kapts.DAGGER_HILT)

    testImplementation(TestingLib.JUNIT)
    testImplementation(TestingLib.ARCHITECTURE_COMPONENTS)

    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_EXT_JUNIT)
    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_RULES)
    androidTestImplementation(AndroidTestingLib.ESPRESSO_CORE)
}
