package com.example.cgeproyect

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform