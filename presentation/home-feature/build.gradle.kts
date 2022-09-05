plugins {
    id("arch.sample.android.library")
    id("arch.sample.android.library.compose")
}

android {
    namespace= "com.example.common"
    namespace= "arch.sample.presentation.homeFeature"
}

dependencies {
    implementation(projects.presentation.common)
    implementation(libs.composeMaterial)
}