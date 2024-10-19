plugins {
    alias(libs.plugins.androidessentials.android.feature.ui)
}

android {
    namespace = "com.felipecoronado.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}