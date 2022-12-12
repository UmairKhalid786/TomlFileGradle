plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.techlads.tomlfilegradle"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.techlads.tomlfilegradle"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation (libs.androidx.appcompat)
    implementation (libs.androidx.compose.runtime)
    implementation (libs.androidx.core.ktx)
    implementation (libs.google.android.material)
}