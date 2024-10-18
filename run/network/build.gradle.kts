plugins {
    alias(libs.plugins.androidessentials.android.library)
    alias(libs.plugins.androidessentials.jvm.ktor)
}

android {
    namespace = "com.felipecoronado.run.network"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(projects.core.domain)
    implementation(projects.core.data)
}