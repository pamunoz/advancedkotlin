package com.pfariasmunoz.advanced.metaprogramming

fun <T>printList(list: List<T>) {
    // We cannot check for the type, but we can
    if (list is List<*>) {
        println("This is a list of something")
    }

}

inline fun <reified T> erased(input: List<Any>) {
    // We can Check for the type with the {inline} and {reified}
    if (input is T) {

    }
}

fun main(args: Array<String>) {

    val listOfStrings = listOf("One", "Two", "Three", "Four", "Five")
    val listOfNumbers = listOf(1, 2, 3, 4, 5)



}