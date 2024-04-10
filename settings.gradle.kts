import com.android.build.api.dsl.SettingsExtension
import java.net.URI

include(":app")


pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
plugins {
    id("com.android.settings").version("8.3.2")
}
configure<SettingsExtension> {
    compileSdk = 34
    minSdk = 23
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = URI("https://jitpack.io") }
    }
}
include(":library")
