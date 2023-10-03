package hu.horvath.kotlintest.features.inmemorydbtest

import org.springframework.data.annotation.Id
import java.math.BigDecimal

data class Coffee(@Id val id: Long, val name: String, val price: BigDecimal)
