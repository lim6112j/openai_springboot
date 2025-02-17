package com.ciel.ai

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
// chatclient openai
import org.springframework.ai.chat.client.ChatClient
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean

@SpringBootApplication
class AppApplication {
		@Bean
		fun runner(builder: ChatClient.Builder) : CommandLineRunner {
				return CommandLineRunner {
				val client = builder.build()
				val response = client.prompt("Tell me a joke").call().content()
				println("Response: $response")
				}
			}
		}
fun main(args: Array<String>) {
	runApplication<AppApplication>(*args)
}
