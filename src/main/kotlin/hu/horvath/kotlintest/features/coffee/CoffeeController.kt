package hu.horvath.kotlintest.features.coffee

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/coffee")
class CoffeeController {
    lateinit var coffeeService: CoffeeService

    @Autowired
    fun initialize(coffeeService: CoffeeService) {
        this.coffeeService = coffeeService
    }

    @GetMapping(value = [""])
    fun getCoffees(): List<Coffee> {
        return coffeeService.getCoffees()
    }

    @GetMapping(value = ["/{id}"])
    fun getCoffee(@PathVariable id: Long): Coffee {
        return coffeeService.getCoffee(id)
    }

    @PostMapping(value = ["/add"])
    fun addCoffee(): Coffee {
        return coffeeService.addCoffee(Coffee(1, "Espresso", BigDecimal.valueOf(1.5)))
    }
}