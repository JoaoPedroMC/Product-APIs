package com.app.produtos.services

import com.app.produtos.components.ProductComponent
import com.app.produtos.models.dto.ProductDTO
import org.springframework.stereotype.Service

@Service
class ProductService (
    val productComponent: ProductComponent
){
    fun insertProduct(productDTO: ProductDTO): Boolean {
        val product = productComponent.generate(productDTO)
        return true
    }

    fun getProduct(idProduct: Long): ProductDTO{
        val productDto = productComponent.findProduct(idProduct)
        return productDto
    }
}