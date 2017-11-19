package io.ducommun.concourse.kotlinPipeline.components.implementations

import io.ducommun.collections.nonEmptyList.NonEmptyList
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Job
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Task

class Job(
        override val name: String,
        override val plan: NonEmptyList<Task>
) : Job