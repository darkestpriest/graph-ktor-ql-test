package main.kotlin.auth

import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    val server = embeddedServer(Netty, System.getenv("port").toInt()) {
        routing {
            get("/echo/{message}") {
                call.respond("Echoing: " + call.parameters["message"])
            }
        }
    }
    DatabaseFactory.init()
    server.start(wait = true)
}