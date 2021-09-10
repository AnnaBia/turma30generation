package org.generation.blogPessoal.model;

//CLASSE RESPONSÁVEL POR ENVIAR UMA RESPOSTA QUANDO O USUÁRIO SE LOGAR, POR ISSO NÃO HAVERÁ @
public class UserLogin {
	// ATRIBUTOS
	private long id;
	private String nome;
	private String usuario;
	private String senha;
	private String token;

	// GETTERS AND SETTERS
	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
