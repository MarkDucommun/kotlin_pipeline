package io.ducommun.concourse.kotlinPipeline.components.implementations

import io.ducommun.collections.nonEmptyList.NonEmptyList
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Run

class Run(
        override val path: String,
        override val dir: String? = null,
        override val args: NonEmptyList<String>? = null
) : Run