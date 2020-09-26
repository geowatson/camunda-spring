package com.example.camunda.camundatest

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableProcessApplication
@SpringBootApplication
class CamundaTestApplication

fun main(args: Array<String>) {
    runApplication<CamundaTestApplication>(*args)
}
