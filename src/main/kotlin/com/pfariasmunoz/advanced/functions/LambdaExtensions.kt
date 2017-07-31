package com.pfariasmunoz.advanced.functions

class Request(val method: String, val query: String, val contentType: String)
class Status(var code: Int, var description: String)
class Response(var content: String, var status: Status) {
    fun status(status: Status.() -> Unit) {

    }
}

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false
    fun next() {
        executeNext = true
    }
}

fun response(response: Response.() -> Unit) {}

fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {

    routeHandler("/index.html") {
        if (request.query != "") {
            // Prossess the query
        }
        response {
            status {
                code = 404
                description = "not faund"
            }
        }

    }

}