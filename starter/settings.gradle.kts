pluginManagement {
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

rootProject.name = "JetpackComposeDrawerNavigation"
include(":app")
include(":feature_articles")
include(":ui_common")
include(":feature_about")
include(":feature_settings")
include(":feature_article")
