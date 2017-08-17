package com.punchlag.dontgiveup.delegate

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

private class NonNullSingleValueVar<T> : ReadWriteProperty<Any?, T> {
    private var value: T? = null

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return value ?: throw IllegalStateException("not initialized")
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        if (this.value == null) {
            this.value = value
        } else {
            throw IllegalStateException("already initialized")
        }
    }
}

object DelegatesExt {
    fun <T> nonNullSingleValue(): ReadWriteProperty<Any?, T> = NonNullSingleValueVar()
}