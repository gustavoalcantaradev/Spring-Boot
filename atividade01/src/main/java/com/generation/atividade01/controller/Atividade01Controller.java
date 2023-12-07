package com.generation.atividade01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class Atividade01Controller {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
}