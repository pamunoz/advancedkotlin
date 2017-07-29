package com.pfariasmunoz.advanced.functions


// In Kotlin we can have inner functions
// And the inner function can have access to
// the parameters from the outside function.
fun foo(fooParam: String) {

    val outerValue = "value"

    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        // we can have access to the variable outside
        println(outerValue)
    }

}

fun main(args: Array<String>) {

    foo("Some Value")
    // but we can't access the bar function, only inside the outer function foo

}