import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType


object BuildConfig {
    val targetSdk = 33
    val compileSdk = 33
    val minSdk = 26
    val applicationId = "app.example.cleanarc"
    val versionCode = 1
    val versionName = "1.0"
}