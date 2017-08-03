package com.pfariasmunoz.advanced.metaprogramming

@Target(AnnotationTarget.CLASS)
annotation class Table(val name: String)
@Target(AnnotationTarget.PROPERTY)
annotation class Field(val name: String)


@Table(name = "contact_table")
data class Contant(val id: Int, @Field(name = "Name") val name: String, val email: String)


fun main(args: Array<String>) {
    // We can have information about the annotation at runtime
    val annotation = Contant::class.annotations.find { it.annotationClass.simpleName == "Table" }
    println(annotation)
}