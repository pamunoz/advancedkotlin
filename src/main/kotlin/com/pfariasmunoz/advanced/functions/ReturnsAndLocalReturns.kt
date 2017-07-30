package com.pfariasmunoz.advanced.functions

fun containingFunctions() {
    val numbers = 1..100
    numbers.forEach mylabel@
    {
        if (it % 5 == 0) {
            return@mylabel
        }
    }
    println("Hello!!!!")
}

fun main(args: Array<String>) {
    containingFunctions()
}