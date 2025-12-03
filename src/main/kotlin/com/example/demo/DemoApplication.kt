package com.example.demo

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {
    @Bean
    fun applicationRunner(
        cRepository: CRepository
    ) = ApplicationRunner {
        println(cRepository.findAllByBbbAaaNotEmpty().size)
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
