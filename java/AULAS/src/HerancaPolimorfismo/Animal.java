package HerancaPolimorfismo;

public abstract class Animal {
	//atributos
	private String nome;
	private int idade;
	
	//construtor
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
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
	
	//método
	public void emitirSom() {
		System.out.println("Emitindo som do bicho ...");
	}
	
}