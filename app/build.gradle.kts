plugins {
    id("arch.sample.android.application")
    id("arch.sample.android.application.compose")
}
android {
    namespace = "com.arch.sample"
    defaultConfig {
        applicationId = BuildConfig.applicationId
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName
    }
}

// Versions are declared in gradle/libs.versions.toml
dependencies {
    // splash screen
    implementation(libs.splashScreen)
    // ===== compose =====
    implementation(libs.composeActivity)
    implementation(libs.composeMaterial)
    implementation(projects.entity)
    implementation(projects.domain)
    implementation(projects.data.repository)
    implementation(projects.data.cache)
    implementation(projects.data.remote)
    implementation(projects.data.local)
    implementation(projects.framework.sync)
    implementation(project(mapOf("path" to ":presentation:common")))
    implementation(project(mapOf("path" to ":presentation:home-feature")))
    debugImplementation(libs.composeTooling)
}
