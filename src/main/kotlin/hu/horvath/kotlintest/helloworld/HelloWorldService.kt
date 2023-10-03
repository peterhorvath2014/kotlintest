package hu.horvath.kotlintest.helloworld

import org.springframework.stereotype.Service

@Service
class HelloWorldService {
    fun helloWorld(): String {
        return "Hello, world!!!"
    }
}