package io.ducommun.concourse.kotlinPipeline.components.implementations

import io.ducommun.concourse.kotlinPipeline.components.interfaces.Task
import io.ducommun.concourse.kotlinPipeline.components.interfaces.ConfigWithImage

data class Task(
        override val task: String,
        override val config: ConfigWithImage
) : Task