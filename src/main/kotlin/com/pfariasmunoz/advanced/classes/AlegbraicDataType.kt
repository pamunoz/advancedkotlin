package com.pfariasmunoz.advanced.classes

// sealed means that only its classes can inherit from it
// but they can be defined only IN THE SAME FILE
sealed class PageResult {
    class Success(val content: String): PageResult()
    class Error(val result: Int, val messsage: String): PageResult()
}

fun getUrlPage(url: String): PageResult {
    val wasValidCall = false
    if (wasValidCall)
    {
        return PageResult.Success("The content")
    }
    else
    {
        return PageResult.Error(404, "Not Found")
    }
}

fun main(args: Array<String>) {
    val pageResult = getUrlPage("/")
    when (pageResult) {
        is PageResult.Success -> println(pageResult.content)
        is PageResult.Error -> println(pageResult.messsage)
    }
}