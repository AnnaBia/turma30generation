package classes;
	/*
		Conta Especial
		real limite		
		(+)usarLimite(soma no saldo e tira do limite)
		
		Usar o limite se no momento do movimento o saldo fica negativo, 
		  ajusta no saldo e dminui no limite.Limite de R$1000
	 */
public class ContaEspecial extends Conta{
	//atributo
	private double limite = 1000;
	private double usarLimite ;
	
	//construtor
	public ContaEspecial(int numero, String nomeCliente, double limite) {
		super(numero, nomeCliente);
		this.limite = limite;
	}
	
	//encapsulamento
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//metodos
	public void usarLimite(double valor) {
		double auxValor;
		if(valor < 0) {
			System.out.println("Valor inválido");
		}
		if(valor > super.getSaldo() + this.usarLimite ) {
			System.out.println("Impossível realizar");
		}
		else if(valor > super.getSaldo()){
			auxValor = valor - super.getSaldo();
			super.credito(auxValor);
			usarLimite -= auxValor;
			System.out.println("Novo limite : " + usarLimite);
		}
	}
	
}
