package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://www.javainuse.com/pcf/pcf-rabbitmq
@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { SpringBootHelloWorldApplication.class }, args);
	}
}