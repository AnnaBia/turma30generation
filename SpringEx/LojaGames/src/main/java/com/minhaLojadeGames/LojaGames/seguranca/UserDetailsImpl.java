package com.minhaLojadeGames.LojaGames.seguranca;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.minhaLojadeGames.LojaGames.model.Usuario;

public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L; // APENAS PARA CONTROLE INTERNO
	// ATRIBUTOS PRIVADOS
	private String userName;
	private String password;

	// CONSTRUTOR DE CLASSE QUE RECEBE COMO PARAMETRO 'USER'
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}

	// CONTRUTOR VAZIO
	public UserDetailsImpl() {
	}

	// ADICIONAR TODOS OS MÉTODOS DA IMPLEMENTAÇÃO ATRAVÉS DO 'USERDETAILSIMPL'
	// POR BOAS PRÁTICAS REALIZAR AS MUDANÇAS DO FALSE P/TRUE E OS GET
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}