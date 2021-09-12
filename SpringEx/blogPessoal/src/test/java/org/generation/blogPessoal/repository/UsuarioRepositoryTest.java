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
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // ALTERA A ORDEM EM QUE É EXECUTADO OS TESTES, ANTES POR MÉTODOS
												// (CLASSE USUARIO), AGORA POR CLASSE
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@BeforeAll // EXECUTA DE UMA VEZ SÓ TODOS OS TESTES
	void start() throws ParseException {
		LocalDate data = LocalDate.parse("1997-08-09", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		Usuario usuario = new Usuario(0L, "Ana Bia", "anaespejo@email.com", "1254917", data);
		// CONDIÇÃO NO CASO DE O USUARIO NÃO ESTIVER SALVO, ELE SALVA
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

	// TESTES PEGANDO COMO BASE OS MÉTODOS CRIADOS NO USUARIOREPOSITORY/ MAIN
	@Test
	@DisplayName("💾 Retorna nome") // APENAS POR BOAS PRÁTICAS
	public void findByNomeRetornaNome() throws Exception {

		Usuario usuario = usuarioRepository.findByNome("Ana Bia");
		assertTrue(usuario.getNome().equals("Ana Bia"));
	}

	@Test
	@DisplayName("💾 Retorna 2 usuários")
	public void findAllByNomeContainingIgnoreCaseRetornaDoisUsuarios() {
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Lima");
		assertEquals(2, listaDeUsuarios.size());
	}

	@AfterAll
	public void end() {
		// usuarioRepository.deleteAll(); // PODE SER USADO TB P/APAGAR TODE O CONTEÚDO DO BANCO
		System.out.println("Teste Finalizado!");
	}
}
