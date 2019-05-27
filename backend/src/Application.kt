package com.darkest

import io.ktor.application.*
import io.ktor.response.*
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
    server.start(wait = true)
}

