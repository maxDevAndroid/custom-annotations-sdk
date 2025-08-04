package com.trivisiontech.custom_annotations_sdk

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class LegacyApi(
    val message: String = "",
    val deprecatedSince: String = ""
)
