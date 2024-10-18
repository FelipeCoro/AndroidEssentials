plugins {
    alias(libs.plugins.androidessentials.android.library)
    alias(libs.plugins.androidessentials.jvm.ktor)
}

android {
    namespace = "com.felipecoronado.auth.data"
}

dependencies {

    implementation(libs.bundles.koin)

    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}