enableFeaturePreview("VERSION_CATALOGS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "Catalog example"
include(":app")
