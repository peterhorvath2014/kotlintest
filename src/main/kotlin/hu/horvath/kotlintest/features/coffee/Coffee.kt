package hu.horvath.kotlintest.features.coffee

import jakarta.persistence.*
import lombok.NoArgsConstructor
import java.math.BigDecimal

@Entity
@NoArgsConstructor
data class Coffee(
    @Id
    @GeneratedValue
    var id: String?,

    @Column(name = "name")
    var name: String?,

    val price: BigDecimal) {
    constructor() : this(null, null, BigDecimal.ZERO)
    }

