plugins {
    id("arch.sample.android.library")
    id("arch.sample.android.library.compose")
}

android {
    namespace = "arch.sample.presentation.common"
}

dependencies {
    api(libs.compose.material)
    api(libs.accompanist.navigation)
    implementation(libs.hilt.android)

    /*
      implementation(libs.androidx.core.ktx)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
    implementation(libs.kotlinx.datetime)


    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material3)
    debugApi(libs.androidx.compose.ui.tooling)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.ui.util)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.runtime.livedata)
    api(libs.androidx.metrics)
    api(libs.androidx.tracing.ktx)
    * */
}
