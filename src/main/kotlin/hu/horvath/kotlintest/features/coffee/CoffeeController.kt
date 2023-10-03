package hu.horvath.kotlintest.features.coffee

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/coffee")
class CoffeeController(private val coffeeService: CoffeeService) {
    @GetMapping("/")
    fun getCoffees(): List<Coffee> {
        return coffeeService.getCoffees()
    }

    @GetMapping("/{id}")
    fun getCoffee(@PathVariable id: String): Coffee {
        return coffeeService.getCoffee(id)
    }

    @PostMapping("/add")
    fun addCoffee(coffee: Coffee): Coffee {
        return coffeeService.addCoffee(coffee)
    }
}