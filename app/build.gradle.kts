plugins {
    id("arch.sample.android.application")
    id("arch.sample.android.application.compose")
}
android {
    namespace = "arch.sample"
    defaultConfig {
        applicationId = BuildConfig.applicationId
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName
    }
}

// Versions are declared in gradle/libs.versions.toml
dependencies {
    // splash screen
    implementation(libs.splashscreen)
    // compose
    implementation(libs.compose.ui)
    implementation(libs.compose.activity)
    implementation(libs.compose.material)
    implementation(libs.compose.animation)
    debugImplementation(libs.compose.tooling)
    implementation(libs.accompanist.navigation)
    // app layers
    implementation(projects.entity)
    implementation(projects.domain)
    implementation(projects.data.repository)
    implementation(projects.data.cache)
    implementation(projects.data.remote)
    implementation(projects.data.local)
    implementation(projects.framework.sync)
    implementation(projects.framework.interactor)
    // presentation
    implementation(projects.presentation.common)
    // home feature
    implementation(projects.presentation.feature.home.impl)
}
