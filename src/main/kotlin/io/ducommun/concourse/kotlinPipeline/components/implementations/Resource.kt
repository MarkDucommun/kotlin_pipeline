package io.ducommun.concourse.kotlinPipeline.components.implementations

import io.ducommun.concourse.kotlinPipeline.components.interfaces.Resource

class Resource<T>(
        override val type: String,
        override val source: T
) : Resource<T>