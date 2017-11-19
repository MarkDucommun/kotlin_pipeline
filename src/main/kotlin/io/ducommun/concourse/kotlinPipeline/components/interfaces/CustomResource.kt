package io.ducommun.concourse.kotlinPipeline.components.interfaces

interface CustomResource : Resource<Map<String, String>> {
        override val source: Map<String, String>
}
