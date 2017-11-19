package io.ducommun.concourse.kotlinPipeline.components.interfaces

import io.ducommun.concourse.kotlinPipeline.components.interfaces.Config

interface TaskWithImage {
    val name: String
    val image: String
    val config: Config
}