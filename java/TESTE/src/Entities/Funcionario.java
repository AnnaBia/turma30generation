package Entities;

public class Funcionario {
	
	//atributos
	private String matricula;
	//protected permite as classe filho manipular o atributo que esta na classe mae
	protected int horasTrabalhadas;
	protected double valorHora;
	//se não fizer o construtor, ele precisa ser zerado, aqui ele foi feito
	public Funcionario(String matricula, int horasTrabalhadas, double valorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	//get = visivel
	public String getMatricula() {
		return matricula;
	}
	//set = modificado
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int horasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void horasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	//metodo
	public double salario() {
		return valorHora*horasTrabalhadas;
	}
	public double salarioExtra() {
		return  500.00;
	}
}
