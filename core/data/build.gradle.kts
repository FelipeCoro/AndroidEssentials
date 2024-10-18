plugins {
    alias(libs.plugins.androidessentials.android.library)
    alias(libs.plugins.androidessentials.jvm.ktor)
}

android {
    namespace = "com.felipecoronado.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)
    implementation(projects.core.domain)
    implementation(projects.core.database)
}