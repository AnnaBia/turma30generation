package com.minhaLojadeGames.LojaGames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.minhaLojadeGames.LojaGames.model.Usuario;

//INTERFACE REPOSITORY RESPONSÁVEL PELA COMUNICAÇÃO DA API COM O BD
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	// BUSCAR DADOS PELO USUARIO SEM LEVAR EM CONSIDERAÇÃO LETRA MAIÚSCULA OU MINÚSCULA
	public Optional<Usuario> findByUsuario(String usuario);
	// Optional = PORQUE OS VALORES PODEM VIR NULOS
}
