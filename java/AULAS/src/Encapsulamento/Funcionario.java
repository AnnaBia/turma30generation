package Encapsulamento;

public class Funcionario {
	//atributos
	private double salario;
	private String nome;
	
	public Funcionario(String nome, int matricula, String departamento) {
		// TODO Auto-generated constructor stub
	}
	//encapsulamento
	//get e set (chama uma informação para depois usa-la
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
