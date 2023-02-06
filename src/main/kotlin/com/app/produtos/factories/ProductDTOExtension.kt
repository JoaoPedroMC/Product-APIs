package com.app.produtos.factories

import com.app.produtos.models.ProductModel
import com.app.produtos.models.dto.ProductDTO

fun ProductDTO.toModel(productModel: ProductModel): ProductModel{
    val dto = this
    return productModel.apply {
        name = dto.name
        description = dto.description
        value = dto.value
        type = dto.type
        stock = dto.stock
    }
}

fun ProductModel.toDto(productDTO: ProductDTO): ProductDTO{
    val model = this
    return productDTO.apply {
        name = model.name
        description = model.description
        value = model.value
        type = model.type
        stock = model.stock
    }
}