package Classes;

public class Paciente {
	public String nome;
	public String cpf;
	public int idade;
	public String situacao;
	public String causa;
	
	void Informacoes() {
		System.out.println("Nome : " + nome);
		System.out.println("CPF : " + cpf);
		System.out.println("Idade : " + idade);
		System.out.println("Situação : " + situacao);
		System.out.println("Causa : " + causa);
	}
}
