package hu.horvath.kotlintest.features.coffee

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController("/coffee")
class CoffeeController {
    lateinit var coffeeService: CoffeeService

    @Autowired
    fun initialize(coffeeService: CoffeeService) {
        this.coffeeService = coffeeService
    }

    @GetMapping
    fun getCoffee(): List<Coffee> {
        return coffeeService.getCoffees()
    }

    @GetMapping("/{id}")
    fun getCoffee(@PathVariable id: Long): Coffee {
        return coffeeService.getCoffee(id)
    }

    @PostMapping("/add")
    fun addCoffee(): Coffee {
        return coffeeService.addCoffee(Coffee(1, "Espresso", BigDecimal.valueOf(1.5)))
    }
}