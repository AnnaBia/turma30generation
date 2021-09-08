package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // INFORMA QUE A MODEL É UMA ENTIDADE E QUE ELA VIRARÁ UMA TABELA NO BD
@Table(name = "tb_usuario") // DEFINE O NOME DA TABELA NO BD
public class Usuario {
	// ATRIBUTOS
	@Id // DEFINE A CHAVE PRIMARIA
	@GeneratedValue(strategy = GenerationType.IDENTITY) // INSERE AUTO-INCREMENTO
	private long id;

	@NotNull // NÃO ACEITA VALORES NULOS
	@Size(min = 2, max = 100) // DEFINE A QTDD MIN E MAX DE CARACTERES
	private String nome;

	@NotNull
	@Size(min = 5, max = 100)
	private String usuario;

	@NotNull
	@Size(min = 5, max = 100)
	private String senha;
	
	// GETTERS AND SETTERS
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
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

}
