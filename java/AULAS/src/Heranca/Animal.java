package Heranca;

public abstract class Animal {
	//atributos
	private String nome;
	private int idade;
	private boolean emitirSom;
	
	//construtor
	public Animal(String nome, int idade, boolean emitirSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emitirSom = emitirSom;
	}
	
	//encapsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(boolean emitirSom) {
		this.emitirSom = emitirSom;
	}
	
}