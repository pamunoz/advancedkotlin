package com.pfariasmunoz.advanced.classes

class Log() {
    companion object Factory {
        // this annotation is for accessing as an static method in java
        @JvmStatic fun createFileLog(filename: String): Log = Log(filename)
    }

    constructor(filename: String): this() {}
}

fun main(args: Array<String>) {
    // thanks to the {companion object} we can access this method as a static method in java
    // But each class can have only a single companion object
    val log = Log.createFileLog("Archivo")
}