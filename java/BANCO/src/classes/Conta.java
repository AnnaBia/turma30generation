package classes;
	/*
	 	Conta(abstract)
	 	int numero				número e o nome(construtor)
	 	String nomeCliente		alterado o saldo o mesmo não pode ser ajustado por setter
	 	double saldo			proteção total
	 	
	 	debito					saldo menos valor informado e colocar o novo resultado no saldo					
	 	credito					saldo mais o valor informado e colocar o novo resultado no saldo
	 	
	 */
public abstract class Conta {
	//tributos
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	//construtor
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	//encapsulamento
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	saldo não pode ser mexido, por isso foi tirado o set
	*/ 
	
	//metodos
	public void debito(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo -= valor;
		}
	}
	
	public void credito(double valor) {
		if(valor < 0) {
			System.out.println("Valor inválido");
		}
		else {
			saldo += valor;
		}
	}
	
}
