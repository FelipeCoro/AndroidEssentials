plugins {
    alias(libs.plugins.androidessentials.android.feature.ui)
}

android {
    namespace = "com.felipecoronado.auth.presentation"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}