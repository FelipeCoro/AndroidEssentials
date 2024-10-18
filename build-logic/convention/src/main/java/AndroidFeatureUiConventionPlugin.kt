import com.felipecoronado.convention.addUiLayerDependencies
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureUiConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("org.jetbrains.kotlin.plugin.compose")
                apply("androidessentials.android.library.compose")
            }
            dependencies {
                addUiLayerDependencies(target)
            }
        }
    }
}