object Sdk {
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 30
    const val COMPILE_SDK_VERSION = 30
}

object Versions {
    const val ANDROIDX_TEST_EXT = "1.1.2"
    const val ANDROIDX_TEST = "1.3.0"
    const val ANDROIDX_FRAGMENT = "1.3.2"
    const val ANDROIDX_LIFECYCLE = "2.3.1"
    const val APPCOMPAT = "1.2.0"
    const val CONSTRAINT_LAYOUT = "2.0.4"
    const val CORE_KTX = "1.3.2"
    const val COROUTINE_ANDROID = "1.3.9"
    const val ESPRESSO_CORE = "3.3.0"
    const val JUNIT = "4.13.2"
    const val KTLINT = "0.40.0"
    const val ARCHITECTURE_COMPONENTS = "2.1.0"
    const val NAVIGATION_COMPONENTS = "2.3.5"
    const val DAGGER_HILT = "2.34-beta"
    const val COIL = "1.1.1"
    const val RETROFIT = "2.6.0"
    const val GSON = "2.8.5"
    const val RETROFIT_GSON = "2.5.0"
    const val LOGGING_INTERCEPTOR = "4.9.1"
}

object BuildPluginsVersion {
    const val DETEKT = "1.16.0"
    const val KTLINT = "10.0.0"
}

object SupportLibs {
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "com.android.support.constraint:constraint-layout:${Versions.CONSTRAINT_LAYOUT}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val ANDROIDX_FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.ANDROIDX_FRAGMENT}"
    const val ANDROIDX_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ANDROIDX_LIFECYCLE}"
    const val ANDROIDX_LIVE_DATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.ANDROIDX_LIFECYCLE}"
    const val ANDROIDX_VIEW_MODEL_STATE = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.ANDROIDX_LIFECYCLE}"
    const val ANDROIDX_NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION_COMPONENTS}"
    const val ANDROIDX_NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION_COMPONENTS}"
    const val DAGGER_HILT = "com.google.dagger:hilt-android:${Versions.DAGGER_HILT}"
}

object ImageLoadingLibs{
    const val COIL = "io.coil-kt:coil:${Versions.COIL}"
}

object CoroutineLibs{
    const val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE_ANDROID}"
}

object NetworkLibs{
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val GSON = "com.google.code.gson:gson:${Versions.GSON}"
    const val RETROFIT_GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT_GSON}"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING_INTERCEPTOR}"
}

object Kapts{
    const val ANDROIDX_LIFECYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler:${Versions.ANDROIDX_LIFECYCLE}"
    const val DAGGER_HILT = "com.google.dagger:hilt-compiler:${Versions.DAGGER_HILT}"
}

object TestingLib {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val ARCHITECTURE_COMPONENTS = "androidx.arch.core:core-testing:${Versions.ARCHITECTURE_COMPONENTS}"
}

object AndroidTestingLib {
    const val ANDROIDX_FRAGMENT_KTX = "androidx.fragment:fragment-testing:${Versions.ANDROIDX_FRAGMENT}"
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}
