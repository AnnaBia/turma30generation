package Encapsulamento;
						//extends = heran�a
public class Funcionario1 extends Pessoa{

		private String departamento;
		
		public Funcionario1(String nome,int matricula,String departamento) {
			//super = cria rela��o com a classe principal, nesse caso Pessoa
			super(nome,matricula);
			this.departamento = departamento;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

	

}
