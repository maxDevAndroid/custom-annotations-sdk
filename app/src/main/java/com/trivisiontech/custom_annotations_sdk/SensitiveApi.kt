package com.trivisiontech.custom_annotations_sdk

@Retention(AnnotationRetention.RUNTIME)
@Target(
    AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY
)
annotation class SensitiveApi(val encrypted: Boolean = true)
