package com.Atividade1.ExerciciosAula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex2")
public class Ex2Controller {
	@GetMapping
	public String objetivos() {
		return "Objetivo: Entender e aplicar Springs";
	}
}
