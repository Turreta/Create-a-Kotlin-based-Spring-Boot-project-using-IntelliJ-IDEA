package com.turreta.kotlin.sb

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ComTurretaKotlinSpringbootApplication

fun main(args: Array<String>) {
    val ctx = SpringApplication.run(ComTurretaKotlinSpringbootApplication::class.java, *args)
    val msg = ctx.getBean("myMessageBean") as MyMessageBean

    println(msg.message)

}
