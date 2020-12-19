package com.digitec.kotlinapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KotlinapiApplication

fun main(args: Array<String>) {
    runApplication<KotlinapiApplication>(*args)
}
