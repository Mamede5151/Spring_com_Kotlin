package com.apikotlin.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiKotlinApplication

fun main(args: Array<String>) {
	runApplication<ApiKotlinApplication>(*args)
}
