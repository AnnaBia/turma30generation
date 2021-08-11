package Entities;

public class Terceiro extends Funcionario{
	public Terceiro(String matricula, int horasTrabalhadas, double valorHora) {
		super(matricula, horasTrabalhadas, valorHora);
	}

	private double adicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	@Override//é uma referencia a mae
	public double salario() {
		return (valorHora*horasTrabalhadas)+adicional;
	}
}
