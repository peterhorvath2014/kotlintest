package hu.horvath.kotlintest.features.coffee

import org.springframework.data.annotation.Id
import java.math.BigDecimal

data class Coffee(@Id val id: String?, val name: String, val price: BigDecimal)
