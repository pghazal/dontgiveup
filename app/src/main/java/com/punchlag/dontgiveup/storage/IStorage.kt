package com.punchlag.dontgiveup.activity.storage

interface IStorage<T> {
    fun set(key: String, value: T)

    fun get(key: String): T

    fun remove(key: String)
}