package com.trivisiontech.custom_annotations_sdk

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class PlannedFeature(
    val message: String = "",
    val releaseVersion: String = ""
)
