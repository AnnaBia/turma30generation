package com.minhaLojadeGames.LojaGames.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.minhaLojadeGames.LojaGames.model.UserLogin;
import com.minhaLojadeGames.LojaGames.model.Usuario;
import com.minhaLojadeGames.LojaGames.repository.UsuarioRepository;

// CLASSE RESPONSÁVEL POR IMPLEMENTAR UM SERVIÇO E CADASTRE OS USUÁRIOS DE ACORDO COM A CAMADA DE SEGURANÇA DA API
@Service
public class UsuarioService {
	// ATRIBUTOS
	@Autowired
	private UsuarioRepository repository;

	public Optional<Usuario> cadastro(Usuario usuario) {
		Optional<Usuario> user = repository.findByUsuario(usuario.getUsuario());
		if (user.isPresent()) {
			return Optional.ofNullable(null);
		}
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);

		return Optional.of(repository.save(usuario));
	}

	public Optional<UserLogin> login(Optional<UserLogin> user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());

		if (usuario.isPresent()) {
			// SE A SENHA DIGITADA FOR IGUAL A SENHA CRIPTOGRAFADA ELE ENTRA NO IF
			if (encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {

				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodeAuth);

				user.get().setToken(authHeader);
				user.get().setNome(usuario.get().getNome());

				return user;
			}
		}
		return null;
	}
}
