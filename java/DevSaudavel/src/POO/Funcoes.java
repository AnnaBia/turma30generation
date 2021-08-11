package POO;

public class Funcoes {

	//Início MAICON

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
	}

