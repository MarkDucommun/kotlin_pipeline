package io.ducommun.concourse.kotlinPipeline.components.interfaces

import io.ducommun.collections.nonEmptyList.NonEmptyList

interface Job {
    val name: String
    val plan: NonEmptyList<Task>
}
