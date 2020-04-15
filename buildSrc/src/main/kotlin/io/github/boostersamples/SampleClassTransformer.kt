package io.github.boostersamples

import com.didiglobal.booster.transform.TransformContext
import com.didiglobal.booster.transform.asm.ClassTransformer
import org.objectweb.asm.tree.ClassNode
import com.google.auto.service.AutoService

@AutoService(ClassTransformer::class)
class SampleClassTransformer : ClassTransformer {

    override fun transform(context: TransformContext, klass: ClassNode): ClassNode {
        println("Transforming ${klass.name}")
        return klass
    }

}
