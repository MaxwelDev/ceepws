package br.edu.maxk.ceepws

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class CeepwsApplication

fun main(args: Array<String>) {
    SpringApplication.run(CeepwsApplication::class.java, *args)
}
