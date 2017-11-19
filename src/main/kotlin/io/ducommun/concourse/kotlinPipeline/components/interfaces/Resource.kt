package io.ducommun.concourse.kotlinPipeline.components.interfaces

interface Resource<T> {
    val type: String
    val source: T
}

