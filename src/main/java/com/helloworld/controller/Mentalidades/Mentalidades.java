package com.helloworld.controller.Mentalidades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/mentalidades") //indicando o enderçamneto da minha aplicação para o postman, o endpoint
public class Mentalidades {
	@GetMapping
	
	public String MentalidadesSaida () {
		return "Hello World!!!	";
	}
	
}