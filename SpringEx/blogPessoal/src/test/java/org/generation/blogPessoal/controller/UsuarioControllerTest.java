package org.generation.blogPessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // DEFINE A ORDEM DOS TESTES MEDIANTE '@ORDER()'
public class UsuarioControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate; //PERMITE OS TESTES NO POSTMAN

	private Usuario usuario;
	private Usuario usuarioUpdate;
	private Usuario usuarioAdmin;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@BeforeAll
	public void start() throws ParseException {
		LocalDate dataAdmin = LocalDate.parse("2000-08-09", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		usuarioAdmin = new Usuario(0L, "Administrador", "admin@email.com", "adm125", dataAdmin);

		if (!usuarioRepository.findByUsuario(usuarioAdmin.getUsuario()).isPresent()) {
			HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioAdmin);
			testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);
		}

		LocalDate dataPost = LocalDate.parse("2001-08-09", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		usuario = new Usuario(0L, "Ana Beatriz", "abeatriz@email.com", "1234567", dataPost);

		LocalDate dataPut = LocalDate.parse("2003-08-09", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		usuarioUpdate = new Usuario(2L, "Ana Beatriz Espejo", "aespejo@email.com", "7654321", dataPut);
	}

	@Test
	@Order(1)
	@DisplayName("✔ Cadastrar Usuário!")
	public void deveRealizarPostUsuario() {
		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuario);
		ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request,
				Usuario.class);

		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
	}

	@Test
	@Order(2)
	@DisplayName("👍 Listar todos os usuários!")
	public void deveMostrarTodosUsuarios() {
		ResponseEntity<String> resposta = testRestTemplate.withBasicAuth("admin@email.com", "adm125")
				.exchange("/usuarios/all", HttpMethod.GET, null, String.class);

		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}

	@Test
	@Order(3)
	@DisplayName("😳 Alterar Usuário!")
	public void deveRealizarPutUsuario() {
		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioUpdate);
		ResponseEntity<Usuario> resposta = testRestTemplate.withBasicAuth("admin@email.com", "adm125")
				.exchange("/usuarios/atualizar", HttpMethod.PUT, request, Usuario.class);
		
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
}
