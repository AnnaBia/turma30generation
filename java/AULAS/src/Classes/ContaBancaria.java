package Classes;

public class ContaBancaria {
	public String banco;
	public int operacao;
	public int agencia;
	public int conta;
	public int digito;
	public double valor;
	
	void Dados() {
		System.out.println("Banco : " + banco);
		System.out.println("Agencia : " + agencia);
		System.out.println("Conta : " + conta + "-" +digito);
		System.out.println("Valor : R$ " + valor);
		
	}
}
