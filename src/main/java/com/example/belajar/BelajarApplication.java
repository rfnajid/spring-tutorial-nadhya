package com.example.belajar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BelajarApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello";
	}

	@GetMapping("/makanan")
	List<String> makanan(){
		List<String> response = new ArrayList();
		response.add("Mie Ayam");
		response.add("Soto");
		response.add("Mie Goreng");

		return response;
	}

}
