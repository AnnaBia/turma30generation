package com.Atividades.SPRING.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que a classe é um controller
@RequestMapping("/ex2")// ponto de acesso
public class Atividade1Ex2Controller {
	@GetMapping //método
	public String objetivos() {
		return "Objetivo: Entender e aplicar Springs";
	}
}
