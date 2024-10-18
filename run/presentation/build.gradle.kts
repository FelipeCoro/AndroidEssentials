plugins {
    alias(libs.plugins.androidessentials.android.feature.ui)
}

android {
    namespace = "com.felipecoronado.run.presentation"
}

dependencies {

    implementation(libs.coil.compose)
    implementation(libs.google.maps.android.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.run.domain)
   //implementation(projects.core.connectivity.domain)
   //implementation(projects.core.notification)
}