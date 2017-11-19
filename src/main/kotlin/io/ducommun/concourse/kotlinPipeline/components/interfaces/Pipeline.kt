package io.ducommun.concourse.kotlinPipeline.components.interfaces

import io.ducommun.collections.nonEmptyList.NonEmptyList

interface Pipeline {

    val resources: NonEmptyList<Resource<*>>?

    val jobs: NonEmptyList<Job>

    val groups: NonEmptyList<Group>?

    val resourceTypes: NonEmptyList<Resource<*>>?
}

