package programas;

import java.util.Scanner;

public class CadAluno {
	/* 
 	laço e pede :
 	pede pela matricula 1 aluno
	informar a nota deste aluno
	vai informar se o aluno ainda continua ativo ou não [o usuario não pode
	digitar true ou false
	tem que fazer o processo até que pergunta continua sim ou não seja não
	após mostra todos os alunos com nota pela regra
	até 5 - estude mais
	acima de 5 - otimo, continue assim
	aluno inativo ou aluno ativo baseado no true ou false de ativo
	somente dos alunos que tem nota
*/

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String alunes[] = { "Ana Beatriz Yujra Espejo", "Ana Carolina Gonzalez de Souza", "Ana Paula Souza Dias",
				"Anderson Coelho da Costa", "Andrei Felipe Corrêa de Souza", "Ariel de Barros Pirangy Soares",
				"Beatriz dos Santos Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta",
				"Cássia de Arruda Nicolau Santos", "Emerson da Silva Santana", "Enzo Fulaneto",
				"Ester Gomes Neves Nascimento", "Fábio Campaner Suzuki", "Felipe Matos de Lima",
				"Felipe Souza da Silva", "Flávio Augusto da Costa", "Giovanna Siqueira Paiva dos Penedos",
				"Gustavo Mesquita Ferreira", "Henrique Uriel Lopes", "João Pedro Cruz Gomes",
				"José Paulo de Matos Ferreira Neto", "Letícia Porto Martins", "Lucas Silva Nunes de Aguiar",
				"Maicon Gomes Cerqueira", "Marcos Vinicius Coutinho Rego", "Matheus de Araujo Farina",
				"Matheus de Brito Milani", "Natália Regina dos Santos Rocha", "Pamela Paulino",
				"Renata dos Santos Ferreira", "Rodrigo Roseo Lopes da Costa", "Sabrina Alves de Paiva",
				"Sergio de Jesus Severo", "Stefani Fernanda Pereira Tosi",
				"Talita gleice maria da gloria da Silva Lima", "Thiago da Silva Machado", "Vinícios Lisboa da Silva",
				"Vinicius Cardoso Siqueira Francisco" };
		int notas[] = new int[alunes.length];
		String matriculas[] = new String[alunes.length];
		boolean ativo[] = new boolean[alunes.length];
		char op = 'S';
		String entraMatricula, auxAtivo;

		for (int x = 0; x < alunes.length; x++) {
			if (x < 9) {
				matriculas[x] = "MAT-0" + (x + 1);
			} else {
				matriculas[x] = "MAT-" + (x + 1);
			}
			ativo[x] = true;
		}

		for (int x = 0; x < alunes.length; x++) {
			System.out.printf("MATRICULA : %s \tALUNE : %s \t\t NOTA : %d SITUACAO ", matriculas[x], alunes[x], notas[x]);
			if (ativo[x] == true) {
				System.out.print(" ATIVO \n");
			} else {
				System.out.print(" INATIVO \n");
			}
		}
		do {
			System.out.print("\nDIGITE A MATRÍCULA DO ALUNE : ");
			entraMatricula = leia.next().toUpperCase();
			for (int x = 0; x < alunes.length; x++) {
				if (entraMatricula.equals(matriculas[x])) {
					System.out.printf("ALUNE : %s\n", alunes[x]);
					System.out.print("DIGITE A NOTA DO ALUNE : ");
					notas[x] = leia.nextInt();
					System.out.print("INFORME O STATUS DO ALUNE [ativo / inativo] : ");
					auxAtivo = leia.next().toUpperCase();
					if (auxAtivo.equals("ATIVO")) {
						ativo[x] = true;
					} else if (auxAtivo.equals("INATIVO")) {
						ativo[x] = false;
					} else {
						System.out.print("STATUS INVÁLIDO, SITUAÇÃO INALTERADA!!!");
					}
				}
			}
			System.out.print("CONTINUAR [S/N] ? : ");
			op = leia.next().toUpperCase().charAt(0);
		} while (op == 'S');

		for (int x = 0; x < alunes.length; x++) {
			if (notas[x] != 0) {
				if (ativo[x] == true) {
					System.out.printf("\nALUNE %s \t NOTA %d\t\t", alunes[x], notas[x]);
					if (notas[x] > 5) {
						System.out.println("Ótimo! Continue assim!\n\n");
					} else if (notas[x] < 5) {
						System.out.println("Estude Mais\n\n");
					}
				}
			}
		}
	}
}
