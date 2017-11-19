package io.ducommun.concourse.kotlinPipeline.components.interfaces

import io.ducommun.collections.nonEmptyList.NonEmptyList

interface Run {
    val path: String
    val dir: String?
    val args: NonEmptyList<String>?
}