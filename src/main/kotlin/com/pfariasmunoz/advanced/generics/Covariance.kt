package com.pfariasmunoz.advanced.generics

import com.pfariasmunoz.advanced.classes.Customer

open class Person
class Employee: Person()

fun operate(person: List<Person>) {}

interface ReadOnlyRepo<out T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {
    // List is coveriant, so we can use Person or Employee
    operate(listOf(Person()))
    operate(listOf(Employee()))

    // Our own implementation of an coveriant interface
    val ro = ReadOnly<Customer>()
    ro.getAll()
}
