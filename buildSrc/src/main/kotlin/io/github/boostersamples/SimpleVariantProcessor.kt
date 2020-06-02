package io.github.boostersamples

import com.android.build.gradle.api.BaseVariant
import com.didiglobal.booster.gradle.project
import com.didiglobal.booster.task.spi.VariantProcessor
import com.google.auto.service.AutoService

@AutoService(VariantProcessor::class)
class SimpleVariantProcessor : VariantProcessor {

    override fun process(variant: BaseVariant) {
        println("${variant.project.name}: ${variant.name}")
    }

}