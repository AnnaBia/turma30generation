package ExemploPolimorfismo;

public class Funcionario {
	private String matricula;
	private int horasTrabalhadas;
	private double valorPorhora;
	public Funcionario(String matricula, int horasTrabalhadas, double valorPorhora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorhora = valorPorhora;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorPorhora() {
		return valorPorhora;
	}
	public void setValorPorhora(double valorPorhora) {
		this.valorPorhora = valorPorhora;
	}
	
	public double salario() {
		return (this.horasTrabalhadas * this.valorPorhora);
	}

}
