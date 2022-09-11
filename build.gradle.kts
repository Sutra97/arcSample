import org.jlleitschuh.gradle.ktlint.KtlintExtension
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.ktlint)
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(libs.android.gradlePlugin)
        classpath(libs.kotlin.gradlePlugin)
        classpath(libs.kotlin.serializationPlugin)
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}

// to run ktlint you can use ./gradlew  ktlintFormat --stacktrace
subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
    configure<KtlintExtension> {
        debug.set(true)
        verbose.set(true)
        coloredOutput.set(true)
        disabledRules.set(setOf("no-wildcard-imports"))
        filter {
            exclude("**/generated/**")
            include("**/kotlin/**")
        }
        reporters {
            reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.CHECKSTYLE)
        }
    }
    tasks.withType(org.jlleitschuh.gradle.ktlint.tasks.GenerateReportsTask::class.java) {
        reportsOutputDirectory.set(project.layout.buildDirectory.dir("reports/ktlint"))
    }
}
