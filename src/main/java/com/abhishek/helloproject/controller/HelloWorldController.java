package com.abhishek.helloproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.abhishek.helloproject.model.User;

@RestController
class HelloWorldController {
	@GetMapping("/hello")
	public ResponseEntity<User> helloWorld() {
		RestTemplate restTemplete = new RestTemplate();
		ResponseEntity<User> user = restTemplete.getForEntity("https://jsonplaceholder.typicode.com/todos/1", User.class);
		
		return user;
	}
}
