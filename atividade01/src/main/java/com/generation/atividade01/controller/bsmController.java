package com.generation.atividade01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bsm")
public class bsmController {
	
	
	@GetMapping
	public String bsm() {
		return "bsm!!!";
	}

}
