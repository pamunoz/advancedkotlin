package com.pfariasmunoz.advanced.delegation

fun LocalDelegatedProperties() {
    val lazy by lazy { initLate() }
}

fun  initLate(): String { return "some string"}
