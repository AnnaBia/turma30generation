package com.minhaLojadeGames.LojaGames.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.minhaLojadeGames.LojaGames.model.Usuario;
import com.minhaLojadeGames.LojaGames.repository.UsuarioRepository;

// CLASSE RESPONSÁVEL POR CONVERTER O USUÁRIO RECEBIDO PARA USER DETAILS
@Service // INDICA QUE A CLASSE É UM SERVIÇO
public class UserDetailsServiceImpl implements UserDetailsService {
	// ATRIBUTOS
	@Autowired
	private UsuarioRepository userRepository;

	// ADICIONAR TODOS OS MÉTODOS DA IMPLEMENTAÇÃO ATRAVÉS DO 'USERDETAILSIMPL'
	@Override												// NO CASO DE ERRO 
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> user = userRepository.findByUsuario(username);
		user.orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
		
		return user.map(UserDetailsImpl::new).get();
	}
}
