package aulasVideo7;
						//extends = heran�a
public class PessoaFisica extends Pessoa1 {
	private long cpf;

	public PessoaFisica() {
		//construtor vazio pq n�o vou usar a passagem de parametro
	}
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
									//super = chama de outra classe(polimorfismo)
		return "Pessoa f�sica : " + super.getNome() + " - CPF : " + this.getCpf(); 
	}
}
