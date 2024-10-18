plugins {
    `kotlin-dsl`
}

group = "com.felipecoronado.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "androidessentials.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = "androidessentials.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("androidLibrary") {
            id = "androidessentials.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidLibraryCompose") {
            id = "androidessentials.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        register("androidFeatureUi") {
            id = "androidessentials.android.feature.ui"
            implementationClass = "AndroidFeatureUiConventionPlugin"
        }

        register("androidRoom") {
            id = "androidessentials.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }

        register("jvmLibrary") {
            id = "androidessentials.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }

        register("jvmKtor") {
            id = "androidessentials.jvm.ktor"
            implementationClass = "JvmKtorConventionPlugin"
        }
    }
}