package ExemploPolimorfismo;

public class Terceiro extends Funcionario{
	private double atributoAdicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorPorhora, double atributoAdicional) {
		super(matricula, horasTrabalhadas, valorPorhora);
		this.atributoAdicional = atributoAdicional;
	}

	public double getAtributoAdicional() {
		return atributoAdicional;
	}

	public void setAtributoAdicional(double atributoAdicional) {
		this.atributoAdicional = atributoAdicional;
	}

	@Override
	public double salario() {
	return(super.getValorPorhora()*super.getHorasTrabalhadas() + atributoAdicional);

	}	
}
