package com.pfariasmunoz.advanced.metaprogramming

import java.lang.reflect.Type

class Transaction(val id: Int, val amount: Double, var description: String = "Default Value") {
    fun validate() {
        if (amount > 10000) {
            println("com.pfariasmunoz.advanced.metaprogramming.Transaction is too large")
        }
    }
}

fun instrospectInstance(obj: Any) {
    println("Class ${obj.javaClass.simpleName}\n")
    println("Properties\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type: ${it.type}\n")
    }
    println("Functions\n")
    obj.javaClass.declaredMethods.forEach {
        println(it.name)
    }

}

fun getType(obj: Type) {
    println(obj.typeName)
}

fun main(args: Array<String>) {
    instrospectInstance(Transaction(1, 10.0, "Something"))

    getType(Transaction::class.java)

}