package hu.horvath.kotlintest.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.hibernate5.LocalSessionFactoryBean


@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
class AppConfig {
    @Bean
    @Primary
    fun objectMapper() = ObjectMapper().apply {
        registerModule(KotlinModule.Builder().build())
    }

    @Bean(name = ["entityManagerFactory"])
    fun sessionFactory(): LocalSessionFactoryBean {
        return LocalSessionFactoryBean()
    }
}