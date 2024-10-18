plugins {
   alias(libs.plugins.androidessentials.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}