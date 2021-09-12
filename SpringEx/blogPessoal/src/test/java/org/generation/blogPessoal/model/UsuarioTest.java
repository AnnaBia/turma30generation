package org.generation.blogPessoal.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioTest {

	public Usuario usuario; // ESTE OBEJTO USA O CONSTRUTOR C/PARAMENTROS
	public Usuario usuarioErro = new Usuario(); // ESTE OBEJTO USA O CONSTRUTOR S/PARAMETROS

	// DEVOLVE A MENSAGEM ENTRE '()' QUE ACOMPANHA AS @ DOS ATRIBUTOS DA CLASSE
	// USUARIO/MODEL-MAIN QUANDO OS CRITÉRIOS NÃO FOREM RESPEITADAS
	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();

	// SERÁ O PRIMEIRO MÉTODO A SER TESTADO ANTES DE QUALQUER OUTRO MÉTODO
	@BeforeEach
	public void start() {
		// É NECESSARIO INSTANCIAR O 'LOCALDATE', POIS SE TRATA DE UMA CLASSE
		LocalDate data = LocalDate.parse("1997-08-09", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		usuario = new Usuario(0L, "Ana Bia", "anaespejo@email.com", "1254917", data);
	}

	// VALIDA OS ATRIBUTOS DA USUARIO/MODEL-MAIN
	@Test
	@DisplayName("✔ Valida Atributos Não Nulos")
	void testValidaAtributos() {
		Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuario); // RECEBE A LISTA DE ERROS DO VALIDATOR
		System.out.println(violacao.toString());
		assertTrue(violacao.isEmpty()); // 

	}

	@Test
	@DisplayName("❌ Não Valida Atributos Nulo")
	void testNaoValidaAtributos() {
		Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuarioErro);
		System.out.println(violacao.toString());
		assertFalse(violacao.isEmpty());
	}

}
