package Entities;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import java.util.List;
import java.util.Scanner;

public class Funcoes {
//entra Site
	public static boolean entraNosite() {
		Scanner ler = new Scanner(System.in);
		char entraSite;
		System.out.println("www.devsaudavel.com.br\n");
		System.out.println("\t\t\t\t*****DEV SAUDÁVEL*****");
		System.out.println("\t\t\t\tProgramando a sua saúde");
		System.out.print("Deseja entrar no site [S/N]: ");
		entraSite = ler.next().toUpperCase().charAt(0);
		if (entraSite == 'S') {
			insereBanner ();
			return true;
		} else {
			System.out.print("Agradecemos a visita Volte Sempre !!!\n");
			return false;
		}	
	}
// banner
	public static void insereBanner () {
		System.out.println("\t════════════════════════════════════════════════════════════════════════════");
		System.out.println("\t♥\t\t\t    TABELA DE PRODUTOS\t\t\t\t   ♥");
		System.out.println("\t════════════════════════════════════════════════════════════════════════════ ");
		System.out.println("\t♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    ESTOQUE    ♥");
	}
	public static void apresentaTabela(List<Produto> lista, List<Produto> carrinho) {
		DecimalFormat df = new DecimalFormat("#.00");//arredondamento do valor								
		LocalDateTime agora = LocalDateTime.now();//data/hora atual
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");// formatar a data
		String dataFormatada = formatterData.format(agora);// formatar a hora
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = formatterHora.format(agora);
		String auxCod;
		int auxQuant = 0;
		int pos=-1;
		char op;
		int opcaoCompra =0;
		Scanner ler = new Scanner(System.in);
		if(entraNosite()) {
			do {
				//tabela dos produtos
				pos = -1;
				for (Produto item : lista) {
					System.out.println("\t♥     "+item.getCodProduto()+" \t♥\t"+item.getProduto()+"\t♥\t"+item.getPreco()+"\t   ♥\t  "+item.getEstoque()+"\t   ♥"+((item.getEstoque()>0)?" ":"\tPRODUTO INDISPONIVEL"));
				}
				System.out.println("\n═════════════════════════════════════════════════════════════════════════════════════════════");
				System.out.println("♥\t\t\t\t  CARRINHO DE COMPRAS\t\t\t\t\t    ♥");
				System.out.println("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
				for (Produto escolhido : carrinho) {
					System.out.println("♥     "+escolhido.getCodProduto()+" \t♥\t"+escolhido.getProduto()+"\t♥\t"+escolhido.getPreco()+"\t   ♥\t  "+escolhido.getEstoque()+"\t♥\t"+(escolhido.getEstoque()*escolhido.getPreco()));
				}
				//escolher o produto
				System.out.print("\nDigite o codigo: ");
				auxCod = ler.next().toUpperCase();	
				for (int x=0; x<lista.size(); x++ ) {
					if (lista.get(x).getCodProduto().equals(auxCod)) {
						pos = x;
						break;
					}
				}
				//Dados do produto escolhido
				if (pos>=0) {
					System.out.printf("\nDADOS DO PRODUTO");
					System.out.printf("\n%s",lista.get(pos).getCodProduto());
					System.out.printf("\n%s",lista.get(pos).getProduto());
					System.out.printf("\n%.2f",lista.get(pos).getPreco());
					System.out.printf("\n%d",lista.get(pos).getEstoque());
					System.out.print("\n\nDigite a quantidade desejada: ");
					int auxQtde = ler.nextInt();
					//Validações de quantidade do produto
					if (auxQtde< 0) {
						System.out.println("Valor inválido!");
					}
					else if (auxQtde==0) {
						System.out.println("Impossível realizar, nenhuma quantidade foi escolhida.");
					}
					else if (lista.get(pos).getEstoque()==0){
						System.out.println("Quantidade indisponível no estoque!");
					}
					else if (lista.get(pos).getEstoque()< auxQtde) {
						System.out.print("Quantidade indisponível no estoque!");
					} 
					else {
						carrinho.add(new Produto(lista.get(pos).getCodProduto(),lista.get(pos).getProduto(),lista.get(pos).getPreco(),auxQtde));
					}
				}
				else {
					System.out.println("Codigo informado não existe!!!");
				}
				//continua com a compra
				System.out.print("\nContinua [S/N] ?:");
				op = ler.next().toUpperCase().charAt(0);

			} while (op=='S');//fechamento compra
			System.out.println("\n═════════════════════════════════════════════════════════════════════════════════════════════");
			System.out.println("♥\t\t\t\t  FECHAMENTO COMPRA\t\t\t\t\t    ♥");
			System.out.println("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
			double auxTotal=0;
			for (Produto escolhido : carrinho) {
					for (int x=0; x<lista.size(); x++ ) {
						
						if (lista.get(x).getCodProduto().equals(escolhido.getCodProduto())) {
							pos = x;
							break;
						}				
					}
				System.out.println(escolhido.getCodProduto()+"\t"+escolhido.getPreco()+"\t"+escolhido.getEstoque()+"\t"+escolhido.getProduto());
				auxTotal = auxTotal + (escolhido.getPreco()*escolhido.getEstoque());
				lista.get(pos).retiraEstoque(escolhido.getEstoque());
				//valor total da compra		
				System.out.printf("\nVALOR DA COMPRA : %.2f",auxTotal);
				System.out.println("\n\nFORMAS DE PAGAMENTO : ");
				System.out.println("Opção [1] - Dinheiro á vista c/ 10% de desconto");
				System.out.println("Opção [2] - Cartão á vista c/ 10% de acréscimo");
				System.out.println("Opção [3] - Cartão em 2x c/ 15% de acréscimo");
				System.out.print("\nDigite a opção de pagamento : ");
				opcaoCompra = ler.nextInt();
				System.out.print("\n\n\n");
				//compra a vista dindin
				if (opcaoCompra == 1) {
					System.out.print("------------------------------------------------\n");
					System.out.print("***** NOTA FISCAL PAULISTA *****\n");
					System.out.print("------------------------------------------------\n");
					System.out.println("COD: "+escolhido.getCodProduto()+"  Prod: "+escolhido.getProduto()+"  R$"+escolhido.getPreco()+"  "+escolhido.getEstoque()+"und");
					System.out.println("Dinheiro à vista");
					System.out.println("9% de ICMS : R$ "+df.format(auxTotal * 0.09));
					System.out.println("10% de desconto : R$ "+df.format(auxTotal * 0.1));
					System.out.println("\nTOTAL DA COMPRA R$ "+df.format(auxTotal * 0.9)+"\n");
					System.out.print("Data de emissão : "+formatterData.format(agora)+"\tHora : "+formatterHora.format(agora)+"\n");
					System.out.print("------------------------------------------------\n\n\n");
				}
				// a vista cartão
				if (opcaoCompra == 2) {
					System.out.print("------------------------------------------------\n");
					System.out.print("***** NOTA FISCAL PAULISTA *****\n");
					System.out.print("------------------------------------------------\n");
					System.out.println("COD: "+escolhido.getCodProduto()+"  Prod: "+escolhido.getProduto()+"  R$"+escolhido.getPreco()+"  "+escolhido.getEstoque()+"und");
					System.out.println("\n\nCartão à vista");
					System.out.println("9% de ICMS : R$ "+df.format(auxTotal * 0.09));
					System.out.println("10% de acréscimo : R$ "+df.format(auxTotal * 0.1));
					System.out.println("\nTOTAL DA COMPRA R$ "+df.format(auxTotal * 1.1)+"\n");
					System.out.print("Data de emissão : "+formatterData.format(agora)+"\tHora : "+formatterHora.format(agora)+"\n");
					System.out.print("------------------------------------------------\n\n\n");
				}
				// 2x no cartão
				if (opcaoCompra == 3) {
					System.out.print("------------------------------------------------\n");
					System.out.print("***** NOTA FISCAL PAULISTA *****\n");
					System.out.print("------------------------------------------------\n");
					System.out.println("COD: "+escolhido.getCodProduto()+"  Prod: "+escolhido.getProduto()+"  R$"+escolhido.getPreco()+"  "+escolhido.getEstoque()+"und");
					System.out.println("\n\n2X no Cartão");
					System.out.println("9% de ICMS : R$ "+df.format(auxTotal * 0.09));
					System.out.println("15% de acréscimo : R$ "+df.format(auxTotal * 0.15));
					System.out.println("Valor da parcela : R$ "+df.format((auxTotal * 1.15)/2)+"\n");
					System.out.println("\nTOTAL DA COMPRA R$ " +df.format(auxTotal * 1.15)+"\n");
					System.out.print("Data de emissão : "+formatterData.format(agora)+"\tHora : "+formatterHora.format(agora)+"\n");
					System.out.print("------------------------------------------------\n\n\n");
				}
			}	
			//zerando carrinho
			carrinho.clear();
			//tabela atualizada apos a compra, estoque ajustado!
			System.out.print("\nTabela Atualizada:\n\r");
			insereBanner();
			for (Produto item : lista) {		
				System.out.println(item.getCodProduto()+"\t"+item.getPreco()+"\t\t"+item.getEstoque()+"\t\t"+item.getProduto());
			}
			System.out.println("---------------------------------------------------------");
			System.out.println("\nOBRIGADO PELA VISITA, ESPERAMOS TE VER DE NOVAMENTE!!\n");
		}
	}


}