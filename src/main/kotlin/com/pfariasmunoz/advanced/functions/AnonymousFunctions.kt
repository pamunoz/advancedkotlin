package com.pfariasmunoz.advanced.functions

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    /*
        This two functions do the same, but the first one uses a lambda, and the
        second a anonymous functions
        With anonymous functions we can have multiple return point, but not with lambdas.
     */
    val value = op(3, {it * it})

    val value2 = op(2, fun(x): Int { return x * x})

    println(value)
    println(value2)

}

