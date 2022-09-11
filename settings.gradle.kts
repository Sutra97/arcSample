pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "arcSample"
include(":app")
include(":domain")
include(":data:remote")
include(":data:local")
include(":data:cache")
include(":presentation:feature:home:api", ":presentation:feature:home:impl")
include(":presentation:common")
include(":framework:sync")
include(":sync")
include(":data:repository")
include(":entity")
include(":framework:interactor")
