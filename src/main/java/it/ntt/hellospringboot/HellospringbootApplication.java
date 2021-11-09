package it.ntt.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//vedi slide 20 -23 ecc 02_Spring Boot

@SpringBootApplication
public class HellospringbootApplication {

	//cartella bootstrap serve per popolare le tabelle
	public static void main(String[] args) {
		System.out.println("Ciao Mondo");
		SpringApplication.run(HellospringbootApplication.class, args);
	}

}
