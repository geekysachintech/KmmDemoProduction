package com.example.kmmdemoproduction

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}