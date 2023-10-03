package hu.horvath.kotlintest.features.coffee

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CoffeeRepository : JpaRepository<Coffee, Long>