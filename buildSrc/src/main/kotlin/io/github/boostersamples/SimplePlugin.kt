package io.github.boostersamples

import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import com.didiglobal.booster.gradle.getAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.Configuration
import org.gradle.api.artifacts.ConfigurationContainer
import org.gradle.api.internal.HasConvention
import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.SourceSetContainer

class SimplePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val android = project.getAndroid<AppExtension>()
        android.applicationVariants.forEach { variant ->
            println(variant.runtimeConfiguration.resolvedConfiguration.files)
        }
    }
}

val Project.sourceSets: SourceSetContainer
    get() = (project as HasConvention).convention.getByName("sourceSets") as SourceSetContainer

val SourceSetContainer.main: SourceSet
    get() = named("main").get()

val ConfigurationContainer.runtimeClasspath: Configuration
    get() = named("runtimeClasspath").get()
