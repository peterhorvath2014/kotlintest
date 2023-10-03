package hu.horvath.kotlintest.features.coffee

import org.springframework.stereotype.Service

@Service
class CoffeeService(val coffeeRepository: CoffeeRepository) {

    fun getCoffee(coffeeId: Long): Coffee {
        return coffeeRepository.findById(coffeeId).get()
    }

    fun getCoffees(): List<Coffee> {
        return coffeeRepository.findAll()
    }

    fun addCoffee(coffee: Coffee): Coffee {
        return coffeeRepository.save(coffee)
    }
}