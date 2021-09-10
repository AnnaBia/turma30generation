package org.generation.blogPessoal.repository;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//INTERFACE REPOSITORY RESPONSÁVEL PELA COMUNICAÇÃO DA API COM O BD
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	// BUSCAR DADOS PELO USUARIO SEM LEVAR EM CONSIDERAÇÃO LETRA MAIÚSCULA OU MINÚSCULA
	public Optional<Usuario> findByUsuario(String usuario);
//Optional=PORQUE OS VALORES PODEM VIR NULOS //findByUsuario=PROCURE PELO NOME DO USUARIO
}