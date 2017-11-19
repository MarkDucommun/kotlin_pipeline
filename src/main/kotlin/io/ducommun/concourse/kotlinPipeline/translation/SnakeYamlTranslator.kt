package io.ducommun.concourse.kotlinPipeline.translation

import io.ducommun.concourse.kotlinPipeline.components.objects.Platform
import io.ducommun.results.Result
import io.ducommun.results.Success
import org.yaml.snakeyaml.DumperOptions
import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.introspector.Property
import org.yaml.snakeyaml.nodes.MappingNode
import org.yaml.snakeyaml.representer.Representer
import org.yaml.snakeyaml.nodes.NodeTuple
import org.yaml.snakeyaml.nodes.Tag
import org.yaml.snakeyaml.introspector.BeanAccess
import java.util.LinkedHashSet
import org.yaml.snakeyaml.introspector.PropertyUtils


class SnakeYamlTranslator : YamlTranslator {


    override fun translate(input: Any): Result<Unit, String> {

        val options = DumperOptions().apply {
            defaultFlowStyle = DumperOptions.FlowStyle.BLOCK
            isCanonical = false
            isPrettyFlow = true
            isAllowReadOnlyProperties = true
            this.isCanonical = false
        }

        val yaml = Yaml(SnakeRepresenter(), options)

        val content = yaml.dump(input)

        return Success(content)
    }

    inner class SnakeRepresenter : Representer() {

        init {
            propertyUtils = UnsortedPropertyUtils()
        }

        override fun representJavaBean(properties: MutableSet<Property>?, javaBean: Any): MappingNode {

            if (!classTags.containsKey(javaBean::class.java))
                addClassTag(javaBean::class.java, Tag.MAP);

            return super.representJavaBean(properties, javaBean);
        }

        override fun representJavaBeanProperty(
                javaBean: Any,
                property: Property,
                propertyValue: Any?,
                customTag: Tag?
        ): NodeTuple? {
            
            return propertyValue?.let {

                if (propertyValue is Platform) {

                    super.representJavaBeanProperty(javaBean, property, propertyValue.toString().toLowerCase(), customTag)

                } else {

                    super.representJavaBeanProperty(javaBean, property, propertyValue, customTag)
                }

            }
        }
    }

    inner class UnsortedPropertyUtils : PropertyUtils() {

        override fun createPropertySet(type: Class<out Any>, bAccess: BeanAccess): Set<Property> {
            return LinkedHashSet(getPropertiesMap(type, BeanAccess.FIELD).values)
        }
    }
}