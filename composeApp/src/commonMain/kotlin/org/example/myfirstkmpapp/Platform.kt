package org.example.myfirstkmpapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform