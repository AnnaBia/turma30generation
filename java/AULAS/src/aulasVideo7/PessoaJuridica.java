package aulasVideo7;
						//extends = heran�a
public class PessoaJuridica extends Pessoa1{
	private long cnpj;

	public PessoaJuridica() {
		//construtor vazio pq n�o vou usar a passagem de parametro
	}
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
								//super = chama de outra classe(polimorfismo)
		return "Pessoa Jur�dica : " + super.getNome() + " - CNPJ : " + this.getCnpj();
	}
}
