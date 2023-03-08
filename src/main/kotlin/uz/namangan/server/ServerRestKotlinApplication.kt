package uz.namangan.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerRestKotlinApplication

fun main(args: Array<String>) {
    runApplication<ServerRestKotlinApplication>(*args)
}
