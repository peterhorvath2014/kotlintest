package hu.horvath.kotlintest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlintestApplication

fun main(args: Array<String>) {
	runApplication<KotlintestApplication>(*args)
}
