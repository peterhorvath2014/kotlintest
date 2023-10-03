package hu.horvath.kotlintest.features.coffee

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity
open class Coffee(
    @Id
    @GeneratedValue
    var id: String?,

    var name: String?,

    var price: BigDecimal?
) {
    constructor() : this(null, null, BigDecimal.ZERO)
}

