package com.Atividade1.ExerciciosAula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex1")
public class Ex1Controller {
	@GetMapping
	public String habilidadesMentalidades() {
		return "Para hoje : Mentalidade - Persistência //Habilidade - Orientação ao Detalhe";
	}
}
