package com.app.produtos.factories

import com.app.produtos.models.ProductModel
import com.app.produtos.models.dto.ProductDTO
import org.springframework.beans.factory.config.AbstractFactoryBean
import org.springframework.stereotype.Component

@Component
class ProductFactory: AbstractFactoryBean<ProductModel>(){

    fun generateModel(productDTO: ProductDTO): ProductModel{
        return productDTO.toModel(this.`object`)
    }

    fun generateDto(productModel: ProductModel): ProductDTO{
        return productModel.toDto(this.`object`)
    }

    override fun getObjectType(): Class<*>? {
        return ProductModel::class.java
    }

    override fun createInstance(): ProductModel {
        return ProductModel()
    }
}