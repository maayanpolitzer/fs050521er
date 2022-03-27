package com.example.FirstServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstServerApplication.class, args);
	}

	@GetMapping
	public String sayHi(){
		return "This method is working!!";
	}

	@GetMapping("/cars")
	public String sayHi2(){
		return "cars!!";
	}

}
