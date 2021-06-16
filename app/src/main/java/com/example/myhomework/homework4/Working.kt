package com.example.myhomework.homework4

class Working(override val name: String, s: String): Employee() {
    fun work() {
        println("John работает")
    }
}