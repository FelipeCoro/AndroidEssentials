plugins {
    alias(libs.plugins.androidessentials.android.library)
    alias(libs.plugins.androidessentials.android.room)
}

android {
    namespace = "com.felipecoronado.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
}