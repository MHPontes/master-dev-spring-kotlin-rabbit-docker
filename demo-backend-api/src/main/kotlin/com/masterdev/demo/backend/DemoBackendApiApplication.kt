package com.masterdev.demo.backend

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableRabbit
@SpringBootApplication
class DemoBackendApiApplication

fun main(args: Array<String>) {
	runApplication<DemoBackendApiApplication>(*args)
}
