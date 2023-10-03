package hu.horvath.kotlintest.helloworld

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    lateinit var helloWorldService: HelloWorldService

    @Autowired
    fun initialize(helloWorldService: HelloWorldService) {
        this.helloWorldService = helloWorldService
    }

    @GetMapping("/hello-world")
    fun helloWorld(): String {
        return helloWorldService.helloWorld()
    }
}