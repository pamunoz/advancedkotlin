package com.pfariasmunoz.advanced.functions

infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {


    "Hello".shouldBeEqualTo("Hello")

    val output = "Palo"

    // We can use the in fix notation
    // But this is only applicable to functions that have single parameters
    output shouldBeEqualTo "Palo"

}