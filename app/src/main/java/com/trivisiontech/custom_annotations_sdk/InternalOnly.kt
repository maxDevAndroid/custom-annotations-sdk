package com.trivisiontech.custom_annotations_sdk

@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR
)
annotation class InternalOnly
