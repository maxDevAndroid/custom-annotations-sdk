package com.trivisiontech.custom_annotations_sdk

@Retention(AnnotationRetention.RUNTIME)
@Target(
    AnnotationTarget.CLASS, AnnotationTarget.FUNCTION
)
annotation class TrackingApi(val event: String)
