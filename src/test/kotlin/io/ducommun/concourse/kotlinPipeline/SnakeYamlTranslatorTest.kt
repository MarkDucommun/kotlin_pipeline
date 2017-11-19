package io.ducommun.concourse.kotlinPipeline

import com.esotericsoftware.yamlbeans.YamlReader
import io.ducommun.concourse.kotlinPipeline.translation.SnakeYamlTranslator
import io.ducommun.results.testHelpers.succeedsAnd
import org.assertj.core.api.KotlinAssertions.assertThat
import org.junit.Test

class SnakeYamlTranslatorTest {

    val subject = SnakeYamlTranslator()

    @Test
    fun `it turns an object into a yaml string`() {

        val testInput = mapOf("A" to listOf("1","2","3"), "B" to listOf("4","5","6"))

        subject.translate(testInput) succeedsAnd { yamlString ->

            val readYaml = YamlReader(yamlString).read()

            assertThat(testInput).isEqualTo(readYaml)
        }
    }
}