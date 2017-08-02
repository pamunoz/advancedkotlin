package com.pfariasmunoz.advanced.delegation

import kotlin.properties.Delegates

// this is a new Type: Name, that is JUST an alias of String
typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData) {
    var department: String by Delegates.observable(
            "Initial value",
            {property, oldValue, newValue ->
                println("property: ${property.name} - has change from: $oldValue - to: $newValue")
            })

    fun printName(string: String) {

    }
}

class Veto {
    var value: String by Delegates.vetoable("A string value") {
        // If the new value don't start with {S}, don't change
        // the value of the property
        prop, old, new -> new.startsWith("S")
    }
}

fun main(args: Array<String>) {
    var employee = Employee("Pablo", "pfariasmunoz@gmail.com")
    employee.printName("A string value, no name value")

    employee.department = "Employee"

    // testing vetoable
    val veto = Veto()
    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)

}
