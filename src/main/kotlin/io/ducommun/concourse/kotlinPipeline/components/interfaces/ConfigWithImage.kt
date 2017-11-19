package io.ducommun.concourse.kotlinPipeline.components.interfaces

import io.ducommun.collections.nonEmptyList.NonEmptyList
import io.ducommun.concourse.kotlinPipeline.components.objects.Input
import io.ducommun.concourse.kotlinPipeline.components.objects.Output
import io.ducommun.concourse.kotlinPipeline.components.objects.Platform

interface ConfigWithImage {
    val platform: Platform
    val inputs: NonEmptyList<Input>?
    val outputs: NonEmptyList<Output>?
    val run: Run
    val image_resource: Resource<*>
}