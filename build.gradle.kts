import org.jlleitschuh.gradle.ktlint.KtlintExtension
plugins {
    alias(libs.plugins.ktlint)
    id("com.android.library") version "7.3.0-rc01" apply false
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
    id("org.jetbrains.kotlin.jvm") version "1.6.21" apply false
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
