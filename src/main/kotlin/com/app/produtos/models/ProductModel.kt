package com.app.produtos.models

import jakarta.persistence.*
import java.math.BigDecimal


@Entity
@Table(name = "product_information")
data class  ProductModel (
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    var id: Long? = null,

    @Column(name = "name")
    var name: String? = null,

    @Column(name = "description")
    var description: String? = null,

    @Column(name = "value")
    var value: BigDecimal? = null,

    @Column(name = "type")
    var type: String? = null,

    @Column(name = "stock")
    var stock: Int? = null
    )