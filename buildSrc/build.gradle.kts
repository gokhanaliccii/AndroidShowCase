plugins {
    `kotlin-dsl`
}
repositories {
    jcenter()
    google()
}

kotlinDslPluginOptions.experimentalWarning.set(false)

object Plugins {
    const val AGP = "4.1.3"
    const val KOTLIN = "1.4.31"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Plugins.KOTLIN}")
    implementation("com.android.tools.build:gradle:${Plugins.AGP}")
}