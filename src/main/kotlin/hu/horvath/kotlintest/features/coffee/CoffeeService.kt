package hu.horvath.kotlintest.features.coffee

import org.springframework.stereotype.Service

@Service
class CoffeeService(private val coffeeRepository: CoffeeRepository) {

    fun getCoffee(coffeeId: String): Coffee {
        return coffeeRepository.findById(coffeeId).get()
    }

    fun getCoffees(): List<Coffee> {
        return coffeeRepository.findAll()
    }

    fun addCoffee(coffee: Coffee): Coffee {
        return coffeeRepository.save(coffee)
    }
}