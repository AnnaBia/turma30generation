package aulasVideo7;
						//extends = herança
public class PessoaFisica extends Pessoa1 {
	private long cpf;

	public PessoaFisica() {
		//construtor vazio pq não vou usar a passagem de parametro
	}
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
									//super = chama de outra classe(polimorfismo)
		return "Pessoa física : " + super.getNome() + " - CPF : " + this.getCpf(); 
	}
}
