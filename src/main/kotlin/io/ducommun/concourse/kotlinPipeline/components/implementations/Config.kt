package io.ducommun.concourse.kotlinPipeline.components.implementations

import io.ducommun.collections.nonEmptyList.NonEmptyList
import io.ducommun.concourse.kotlinPipeline.components.objects.Input
import io.ducommun.concourse.kotlinPipeline.components.objects.Output
import io.ducommun.concourse.kotlinPipeline.components.objects.Platform
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Run
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Config

data class Config(
        override val platform: Platform,
        override val inputs: NonEmptyList<Input>? = null,
        override val outputs: NonEmptyList<Output>? = null,
        override val run: Run
) : Config