package com.generation.atividade01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("endpoint3")
public class endpoint3Controller {
	
	@GetMapping
	public String endpoint3() {
		return "Aprender mais sobre SQL,"
				+ " Reforçar o conhecimento sobre Java";
	}

}
