package io.ducommun.concourse.kotlinPipeline.components.interfaces

interface ResourceWithName<T> : Resource<T> {
    val name: String
}