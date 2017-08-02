package com.pfariasmunoz.advanced.classes

// this is a new Type: Name, that is JUST an alias of String
typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData) {
    fun printName(string: String) {

    }
}

fun main(args: Array<String>) {
    var employee = Employee("Pablo", "pfariasmunoz@gmail.com")
    employee.printName("A string value, no name value")
}