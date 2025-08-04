package com.trivisiontech.custom_annotations_sdk

import org.junit.Assert.assertNotNull
import org.junit.Test
import kotlin.reflect.full.findAnnotation

class AnnotationTests {

    @Test
    fun `PlannedFeature annotation is present`() {
        val method = PlannedTestClass::class.members.find { it.name == "futureMethod" }
        val annotation = method?.findAnnotation<PlannedFeature>()
        assertNotNull(annotation)
    }

    @Test
    fun `LegacyApi annotation is present`() {
        val method = LegacyTestClass::class.members.find { it.name == "oldMethod" }
        val annotation = method?.findAnnotation<LegacyApi>()
        assertNotNull(annotation)
    }

    @Test
    fun `ExperimentalApi annotation is present`() {
        val method = ExperimentalTestClass::class.members.find { it.name == "experimentalMethod" }
        val annotation = method?.findAnnotation<ExperimentalApi>()
        assertNotNull(annotation)
    }

    class PlannedTestClass {
        @PlannedFeature(message = "Nova lógica em desenvolvimento", releaseVersion = "2.0.0")
        fun futureMethod() {
        }
    }

    class LegacyTestClass {
        @LegacyApi(message = "API antiga, será removida", deprecatedSince = "1.5.0")
        fun oldMethod() {
        }
    }

    class ExperimentalTestClass {
        @ExperimentalApi(message = "Funcionalidade em testes")
        fun experimentalMethod() {
        }
    }
}
