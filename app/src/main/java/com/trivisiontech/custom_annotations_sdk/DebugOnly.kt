package com.trivisiontech.annotationslib

/**
 * Marque APIs que devem ser visíveis apenas em builds de debug.
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.FILE)
@Retention(AnnotationRetention.BINARY)
annotation class DebugOnly
