package backend

import org.jetbrains.exposed.sql.Table

object User : Table() {
    val id = varchar("id", 16).primaryKey()
    val name = varchar("name", 16)
    val phone = varchar("phone", 16)
}

object Account : Table() {
    val id = binary("id", 16).primaryKey()
    val user = varchar("name", 16)
    val account = varchar("account", 16)
}