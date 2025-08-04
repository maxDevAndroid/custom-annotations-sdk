package com.trivisiontech.custom_annotations_sdk

@Deprecated(
    message = "This API is obsolete. Use the recommended alternative.",
    level = DeprecationLevel.WARNING
)
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY
)
annotation class Obsolete
