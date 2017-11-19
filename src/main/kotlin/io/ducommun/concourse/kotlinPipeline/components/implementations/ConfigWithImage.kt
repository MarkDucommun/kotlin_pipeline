package io.ducommun.concourse.kotlinPipeline.components.implementations

import io.ducommun.collections.nonEmptyList.NonEmptyList
import io.ducommun.concourse.kotlinPipeline.components.interfaces.ConfigWithImage
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Resource
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Run
import io.ducommun.concourse.kotlinPipeline.components.objects.Input
import io.ducommun.concourse.kotlinPipeline.components.objects.Output
import io.ducommun.concourse.kotlinPipeline.components.objects.Platform

data class ConfigWithImage(
        override val platform: Platform,
        override val image_resource: Resource<*>,
        override val inputs: NonEmptyList<Input>? = null,
        override val outputs: NonEmptyList<Output>? = null,
        override val run: Run
) : ConfigWithImage