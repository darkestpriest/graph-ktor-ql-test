package main.kotlin.auth

import org.jetbrains.exposed.sql.Table

object Auth : Table("auth") {
    val username = varchar("username", 16).primaryKey()
    val password = varchar("password", 100)
}

object Profile : Table("profile") {
    val username = varchar("username", 16)
    val profile = varchar("profile", 16)
}