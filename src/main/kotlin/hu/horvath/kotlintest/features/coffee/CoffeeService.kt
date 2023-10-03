package hu.horvath.kotlintest.features.coffee

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CoffeeService {
    lateinit var coffeeRepository: CoffeeRepository

    @Autowired
    fun initialize(coffeeRepository: CoffeeRepository) {
        this.coffeeRepository = coffeeRepository
    }

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