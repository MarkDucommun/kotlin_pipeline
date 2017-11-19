package io.ducommun.concourse.kotlinPipeline.translation

import io.ducommun.results.Result

interface YamlTranslator {

    fun translate(input: Any): Result<Unit, String>
}