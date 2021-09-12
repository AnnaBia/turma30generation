package org.generation.blogPessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.generation.blogPessoal.model.Usuario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@BeforeAll
	void start() throws ParseException {
		LocalDate data = LocalDate.parse("1997-08-09", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		Usuario usuario = new Usuario(0L, "Ana Bia", "anaespejo@email.com", "1254917", data);
		if (!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);

		usuario = new Usuario(0L, "João Pedro", "jperigo@email.com", "1234567", data);
		if (!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);

		usuario = new Usuario(0L, "Larissa Lima", "laripeixe@email.com", "7654321", data);
		if (!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);

		usuario = new Usuario(0L, "Leticia Lima", "letyleao@email.com", "5674123", data);
		if (!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
	}

	@Test
	@DisplayName("💾 Retorna nome")
	public void findByNomeRetornaNome() throws Exception {
		Usuario usuario = usuarioRepository.findByNome("Ana Bia");
		assertTrue(usuario.getNome().equals("Ana Bia"));
	}

	@Test
	@DisplayName("💾 Retorna 3 usuários")
	public void findAllByNomeContainingIgnoreCaseRetornaTresUsuarios() {
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Lima");
		assertEquals(3, listaDeUsuarios.size());
	}

	@AfterAll
	public void end() {
		usuarioRepository.deleteAll();
	}
}
