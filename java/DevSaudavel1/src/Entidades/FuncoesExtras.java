package Entidades;

import java.util.List;

import ClassDevSaudavel.Produto;

public class FuncoesExtras {

	//Cabeçalho do site
	public static void insereBanner() {
		System.out.println("www.devsaudavel.com.br || versão 2.0\n");
		System.out.println("\t\t\t\t*****DEV SAUDÁVEL*****");
		System.out.println("\t\t\t\tProgramando a sua saúde");
	}

	//Cabeçalho da tabela
	public static void tituloTabela() {
		System.out.println("\n\t♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		System.out.println("\t♥\t\t\t    TABELA DE PRODUTOS\t\t\t\t   ♥");
		System.out.println("\t════════════════════════════════════════════════════════════════════════════ ");
		System.out.println("\t♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    ESTOQUE    ♥");
	}
	
	public static void linhaTabela() {
		System.out.println("\n\t════════════════════════════════════════════════════════════════════════════");
	}
	

	//Cabeçalho do carrinho
	public static void tituloCarrinho() {
		System.out.println("\n═════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("♥\t\t\t\t  CARRINHO DE COMPRAS\t\t\t\t\t    ♥");
		System.out.println("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
	}
	public static void linhaCarrinho() {
		System.out.println("═════════════════════════════════════════════════════════════════════════════════════════════");
	
	}
	
	//Cabeçalho nota fiscal
	public static void tituloNota(){
			System.out.println("======================================= NOTA FISCAL =========================================\n");
			System.out.println("www.devsaudavel.com.br || versão 2.0\n");
			System.out.println("\t\t\t\t  *****DEV SAUDÁVEL*****\n");
			System.out.println("\t\t\t\t  Programando a sua saúde\n");
			System.out.println("\n\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
		}
	public static void linhaNota() {
			System.out.println("\n=============================================================================================\n");
		}
	
	
	public static void opcoesPagamento() {
		
		System.out.println("\n\nFORMAS DE PAGAMENTO : ");
		System.out.println("Opção [1] - Dinheiro á vista c/ 10% de desconto");
		System.out.println("Opção [2] - Cartão á vista c/ 10% de acréscimo");
		System.out.println("Opção [3] - Cartão em 2x c/ 15% de acréscimo");
	
	}
	
	public static void formaPagamento(List< > lista) {
		
		//Opção 1 - à vista
		if (opcao == 1) {
			for (contador = 0; contador < 10; contador++) {
				if (carrinhoCompras[contador] != 0) {
					System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥");
				}
			}
			System.out.println("\n\nDinheiro à vista");
			System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
			System.out.println("10% de desconto : R$ "+df.format(total * 0.1));
			System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 0.9)+"\n");
			System.out.print("\n\t\t\t\t\tData de emissão : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
			linhaNota(); //Maic
		}
		//Opção 2 - à vista cartão
		if (opcao == 2) {
			for (contador = 0; contador < 10; contador++) {
				if (carrinhoCompras[contador] != 0) {
					System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥");
				}
			}
			System.out.println("\n\nCartão à vista");
			System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
			System.out.println("10% de acréscimo : R$ "+df.format(total * 0.1));
			System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 1.1)+"\n");
			System.out.print("\n\t\t\t\t\tData de emissão : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
			linhaNota(); //Maic
		}	
		//Opção 3 - em 2X no cartão
		else if (opcao == 3) {
			for (contador = 0; contador < 10; contador++) {
				if (carrinhoCompras[contador] != 0) {
					System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥");
				}
			}
			System.out.println("\n\n2X no Cartão");
			System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
			System.out.println("15% de acréscimo : R$ "+df.format(total * 0.15));
			System.out.println("Valor da parcela : R$ "+df.format((total * 1.15)/2)+"\n");
			System.out.println("\nTOTAL DA COMPRA R$ " +df.format(total * 1.15)+"\n");
			System.out.print("\n\t\t\t\t\tData de emissão : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
			linhaNota(); //Maic
		}					
	}
	
	}
