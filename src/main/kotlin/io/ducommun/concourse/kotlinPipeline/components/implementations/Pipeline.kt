package io.ducommun.concourse.kotlinPipeline.components.implementations

import io.ducommun.collections.nonEmptyList.NonEmptyList
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Pipeline
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Resource
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Group
import io.ducommun.concourse.kotlinPipeline.components.interfaces.Job
import io.ducommun.results.Result

data class Pipeline(
        override val resources: NonEmptyList<Resource<*>>? = null,
        override val jobs: NonEmptyList<Job>,
        override val groups: NonEmptyList<Group>? = null,
        override val resourceTypes: NonEmptyList<Resource<*>>? = null
) : Pipeline