package Encapsulamento;

public class Pessoa {
	private String nome;
	private int matricula;
	
	public Pessoa(String nome,int matricula){
		//this - da minha propria class Pessoa
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
