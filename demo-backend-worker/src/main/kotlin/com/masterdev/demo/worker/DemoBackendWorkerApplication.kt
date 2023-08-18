package com.masterdev.demo.worker

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableRabbit
@SpringBootApplication
class DemoBackendWorkerApplication

fun main(args: Array<String>) {
	runApplication<DemoBackendWorkerApplication>(*args)
}
