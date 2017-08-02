package com.pfariasmunoz.advanced.delegation

// This extension properties can be applied to companion objects
// But this extensions cannot have initialization
val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {
    println("Hello".hasAmpersand)
    println("Hello & bye".hasAmpersand)
}