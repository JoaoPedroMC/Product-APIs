package com.app.produtos.controllers

import com.app.produtos.models.dto.DefaultResponsePayload
import com.app.produtos.models.dto.ProductDTO
import com.app.produtos.services.ProductService
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/products"])
class ProductController(
    val productService: ProductService
) {

    @PostMapping
    fun insertProduct(@RequestBody productDTO: ProductDTO): ResponseEntity<DefaultResponsePayload>{
        val productCreated = productService.insertProduct(productDTO)
        if (productCreated){
            return ResponseEntity.status(HttpStatus.CREATED).body(DefaultResponsePayload("success"))
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(DefaultResponsePayload("error"))
    }

    @GetMapping("/{idProduct}")
    fun getProduct(@PathVariable idProduct: Long): ResponseEntity<DefaultResponsePayload> {
        val productDtoReturned = productService.getProduct(idProduct)
        return ResponseEntity.status(HttpStatus.CREATED).body(DefaultResponsePayload(productDtoReturned))
    }
}