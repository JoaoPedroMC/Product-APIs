package com.app.produtos.components

import com.app.produtos.factories.ProductFactory
import com.app.produtos.models.dto.ProductDTO
import com.app.produtos.repositories.ProductRepository
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class ProductComponent (
    val productFactory: ProductFactory,
    val productRepository: ProductRepository
) {
    @Transactional(rollbackFor = [Exception::class])
    fun generate(productDTO: ProductDTO): Boolean{
        val productModel = productFactory.generateModel(productDTO)
        productRepository.save(productModel)
        return true
    }


    fun findProduct(idProduct: Long): ProductDTO{
        val productModel = productRepository.findProductById(idProduct)
        val productDTO = productFactory.generateDto(productModel)
        return productDTO
    }
}