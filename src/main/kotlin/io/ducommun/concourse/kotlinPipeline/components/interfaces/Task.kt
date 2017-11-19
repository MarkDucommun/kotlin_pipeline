package io.ducommun.concourse.kotlinPipeline.components.interfaces

interface Task {
    val task: String
    val config: ConfigWithImage
}

