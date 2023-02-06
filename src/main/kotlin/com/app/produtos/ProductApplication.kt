package com.app.produtos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan(basePackages = arrayOf("com.app.produtos.models"))
class ProductApplication

fun main(args: Array<String>) {
    runApplication<ProductApplication>(*args)
}