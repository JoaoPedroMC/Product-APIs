package com.app.produtos.models.dto

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

class ProductDTO {
    @JsonProperty("product_name")
    var name: String? = null

    @JsonProperty("product_description")
    var description: String? = null

    @JsonProperty("product_value")
    var value: BigDecimal? = null

    @JsonProperty("product_type")
    var type: String? = null

    @JsonProperty("product_stock")
    var stock: Int? = null
}