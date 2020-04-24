package com.sovereign.gamestateservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GamestateServiceApplication

fun main(args: Array<String>) {
	runApplication<GamestateServiceApplication>(*args)
}
