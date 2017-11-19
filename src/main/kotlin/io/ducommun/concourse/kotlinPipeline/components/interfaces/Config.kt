package io.ducommun.concourse.kotlinPipeline.components.interfaces

import io.ducommun.collections.nonEmptyList.NonEmptyList
import io.ducommun.concourse.kotlinPipeline.components.objects.Input
import io.ducommun.concourse.kotlinPipeline.components.objects.Output
import io.ducommun.concourse.kotlinPipeline.components.objects.Platform

interface Config {
    val platform: Platform
    val inputs: NonEmptyList<Input>?
    val outputs: NonEmptyList<Output>?
    val run: Run
}

