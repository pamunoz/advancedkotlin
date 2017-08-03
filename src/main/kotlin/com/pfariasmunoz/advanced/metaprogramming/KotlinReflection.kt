package com.pfariasmunoz.advanced.metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.full.memberProperties

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main(args: Array<String>) {

    // IF we want to have information about the class at runtime ******
    // we use only class without class.java to have the Kotlin class, not java
    val classInfo = Transaction::class

    classInfo.memberProperties.forEach {
        println("Property: ${it.name}, of type: ${it.returnType}")
    }

    println("-------------******------------------++++++++++")

    classInfo.constructors.forEach {


        println("Constructor: ${it.name}\n***Parameters***\n\n${it.printKParameters(it.parameters)}")
    }


    getKotlinType(Transaction::class)

    // IF we want to create an instance at runtime***

    val constructor = ::Transaction

    println(constructor)

    // Create an isntance of the transaction object with contructor created
    val transaction = constructor.call(1, 2000, "Some description")

    val transaction2 = constructor.callBy(
            mapOf(
                    constructor.parameters[0] to 1,
                    constructor.parameters[1] to 3000))

    // if we want to access the parameters by name
    val idParam = constructor.parameters.first { it.name == "id" }
    val amountParam = constructor.parameters.first { it.name == "amount" }

    // We can then use the names
    val transaction3 = constructor.callBy(mapOf(idParam to 1, amountParam to 3000))
    println(transaction2.description)

    // We can access to the properties
    val validateFunc = Transaction::validate

    // We can access the properties if don't know the name
    val trans = Transaction(1, 20.0, "New Transaction")

    val nameProperty = Transaction::class.memberProperties.find { it.name == "description" }

    println(nameProperty?.get(trans))

}

fun KFunction<Transaction>.printKParameters(list: List<KParameter>): String {
    val bd = StringBuilder()
    list.forEach {
        bd.append(" Parameter: ${it.name}\n" +
                " Type: ${it.type}\n")

    }
    return bd.toString()
}