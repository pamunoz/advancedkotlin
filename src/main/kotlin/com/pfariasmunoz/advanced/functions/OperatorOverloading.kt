package com.pfariasmunoz.advanced.functions


data class Time(val hours: Int, val min: Int) {
    // Here we are overloading the + symbol and using it as an operator
    operator fun plus(time: Time): Time {
        val minutes = this.min + time.min
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

fun StringBuilder.plus(st: StringBuilder) {
    st.forEach { this.append(it) }
}

fun main(args: Array<String>) {

    val newTime = Time(10, 40) + Time(3, 20)
    println(newTime)

    val sb = StringBuilder()
    for (str in sb) {
        str + "value"
    }
}