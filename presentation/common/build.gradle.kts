plugins {
    id("arch.sample.android.library")
    id("arch.sample.android.feature")
    id("arch.sample.android.library.compose")
}

android {
    namespace= "arch.sample.presentation.common"
}

dependencies {
    implementation(libs.composeMaterial)
}