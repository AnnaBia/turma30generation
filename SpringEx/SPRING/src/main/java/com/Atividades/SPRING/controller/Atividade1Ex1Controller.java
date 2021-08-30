package com.Atividades.SPRING.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que a classe é um controller
@RequestMapping("/ex1")// ponto de acesso
public class Atividade1Ex1Controller {
	@GetMapping //método
	public String mentalidadesHabilidades() {
		return "Para hoje : Mentalidade - Persistência _ Habilidade - Orientação ao Detalhe";
	}
}
