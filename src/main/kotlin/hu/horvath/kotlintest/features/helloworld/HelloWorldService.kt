package hu.horvath.kotlintest.features.helloworld

import org.springframework.stereotype.Service

@Service
class HelloWorldService {
    fun helloWorld(): String {
        return "Hello, world!!!"
    }
}