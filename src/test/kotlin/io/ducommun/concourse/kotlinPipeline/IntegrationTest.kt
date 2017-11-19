package io.ducommun.concourse.kotlinPipeline

import io.ducommun.collections.nonEmptyList.nonEmptyListOf
import io.ducommun.concourse.kotlinPipeline.components.implementations.*
import io.ducommun.concourse.kotlinPipeline.components.objects.DockerImageResource
import io.ducommun.concourse.kotlinPipeline.components.objects.Platform
import io.ducommun.concourse.kotlinPipeline.translation.SnakeYamlTranslator
import io.ducommun.results.testHelpers.succeedsAnd
import org.assertj.core.api.KotlinAssertions.assertThat
import org.junit.Test
import java.io.File

class IntegrationTest {

    @Test
    fun `it can create a very simple pipeline`() {

        val expectedPipeline = String(File("src/test/resources/hello-world.yml").readBytes())

        val actualPipeline = Pipeline(
                jobs = nonEmptyListOf(Job(
                        name = "hello-world",
                        plan = nonEmptyListOf(Task(
                                task = "say-hello",
                                config = ConfigWithImage(
                                        platform = Platform.LINUX,
                                        image_resource = Resource(
                                                type = "docker-image",
                                                source = DockerImageResource(
                                                        repository = "busybox"
                                                )
                                        ),
                                        run = Run(
                                                path = "echo",
                                                args = nonEmptyListOf("Hello world!")
                                        )
                                )
                        ))
                ))
        )

        SnakeYamlTranslator().translate(actualPipeline) succeedsAnd {

            assertThat(it).contains(expectedPipeline)
        }
    }
}