package org.generation.blogPessoal.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // INFORMA QUE A MODEL É UMA ENTIDADE E QUE ELA VIRARÁ UMA TABELA NO BD
@Table(name = "tb_usuario") // DEFINE O NOME DA TABELA NO BD
public class Usuario {
	// ATRIBUTOS
	@Id // DEFINE A CHAVE PRIMARIA
	@GeneratedValue(strategy = GenerationType.IDENTITY) // INSERE AUTO-INCREMENTO
	private long id;

	@NotNull(message = "O atributo Nome é obrigatório!")
	@Size(min = 2, max = 100) 
	private String nome;

	@NotNull(message = "O atributo Usuário é obrigatório!")
	@Size(min = 5, max = 100)
	private String usuario;

	@NotNull(message = "O atributo Senha é obrigatória!")
	@Size(min = 5, max = 100, message = "A Senha deve ter no mínimo 8 caracteres")
	private String senha;

	@Column(name = "data_nascimento")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "O atributo Data de Nascimento é obrigatório!")
	private LocalDate dataNascimento;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	public Usuario(long id, String nome, String usuario, String senha, LocalDate dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
	}

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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

}
