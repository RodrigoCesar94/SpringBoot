package com.helloworld.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos") //indicando o enderçamneto da minha aplicação para o postman, o endpoint
public class objetivos {
	@GetMapping
	
	public String Objetivos () {
		return "prática e responsabildiade";
	}
	
}