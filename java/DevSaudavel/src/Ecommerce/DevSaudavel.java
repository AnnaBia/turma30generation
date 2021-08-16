package Ecommerce;

	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	import java.text.DecimalFormat;

	public class DevSaudavel {
		/*
			PROJETO E-COMMERCE - LOJA DE PRODUTOS SAUDAVEIS 
			PROGRAMADO POR : 
			ANA BEATRIZ YUJRA ESPEJO
			GIOVANNA SIQUEIRA PAIVA DOS PENEDOS 
			HENRIQUE URIEL LOPES 
			MAICON GOMES CERQUEIRA 
			VINICIUS CARDOSO SIQUEIRA FRANCISCO
	 */
	public static void main(String[] args) {
//INÍCIO VINICIUS 			        
		DecimalFormat df = new DecimalFormat("#.00");//arredondamento do valor								
		LocalDateTime agora = LocalDateTime.now();//data/hora atual
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");// formatar a data
		String dataFormatada = formatterData.format(agora);// formatar a hora
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = formatterHora.format(agora);
		Scanner ler = new Scanner(System.in);
     	String [] verificarRepeticao = {"","","","","","","","","",""}; //Auxilia na verificação de um código, se selicionado mais de uma vez numa compra
		String [] codProduto = { "G3-1", "G3-2","G3-3","G3-4","G3-5","G3-6","G3-7","G3-8","G3-9","G3-10"};
		String [] produto = { "Glutamina", "Vitamina C", "Regata Cav", "Tenis Sports", "Whey Prot", "Snacks Div", "C. Legging", "Camiseta", "BCAA CAPS", "Corda P."};
		String zerarCarrinho = " ";
		String auxCod = " ";
		double [] preco = { 30.00, 15.00, 45.00, 100.00, 75.00, 12.00, 80.00, 24.00, 42.00, 20.00 };
		double total = 0.0;			
		int[] estoque = new int[10];  
		int[] carrinhoCompras = new int[10];
		int contador = 0;
		int opcao = 0;
		int auxQuant = 0;
		char continua = ' ';
		char desejaEntraNoSite = ' ';
		char desejaVoltarParaSite = ' ';
		
		// LIMITA O ESTOQUE ATÉ 10 
		for(contador = 0 ; contador < 10 ; contador++){
			estoque[contador] = 10;	
		}
		// ENTRA SITE
		do{
			insereBanner();
			do{
				System.out.print("\nDeseja entrar no site [S/N] ? : ");
				desejaEntraNoSite = ler.next().toUpperCase().charAt(0);
			}while(desejaEntraNoSite != 'S' && desejaEntraNoSite != 'N');
			// APRESENTAÇÃO TABELA PRODUTOS 
			if(desejaEntraNoSite == 'S' || desejaEntraNoSite == 's'){
				tituloTabela();
				for(contador = 0 ; contador < 10 ; contador++){
					System.out.print("\n\t♥     "+codProduto[contador]+" \t♥\t"+ produto[contador]+"\t♥\t"+ preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥");
				}
				linha(true);
//FIM VINICIUS 
//INÍCIO ANA 
					do {// ESCOLHE PRODUTO
						System.out.print("\nSelecione o código do produto : ");
						auxCod = ler.next().toUpperCase();
						// CASO O PRODUTO SELECIONADO JÁ ESTEJA EM CARRINHO
						for(contador = 0; contador < 10;contador++) {
							if(auxCod.equals(verificarRepeticao[contador])) {
								System.out.print("\nVocê já selecionou este produto, deseja escolher outro [S/N] ? ");
								continua = ler.next().toUpperCase().charAt(0);
								// NO CASO DE 'S'
								if(continua == 'S') {
									auxQuant = 0;
									tituloTabela();									
									for(contador = 0;contador < 10;contador++) {
										System.out.print("\t♥     "+codProduto[contador]+" \t♥\t"+ produto[contador]+"\t♥\t"+ preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥\n");
									}
									linha(true); 
									System.out.print("\nSelecione o código do produto : ");
									auxCod = ler.next().toUpperCase();
									contador = 0;
									while(auxCod.equalsIgnoreCase(codProduto[contador])){
										contador++;
									}
								}		
							}
//FIM ANA 
//INÍCIO HENRIQUE 			
							//NO CASO DE 'N' ou SE O CLIENTE NÃO TIVER DIGITADO O MESMO CÓDIGO
							// ESCOLHE QUANTIDADE
							if (auxCod.equals(codProduto[contador])) {
						 		verificarRepeticao[contador] = codProduto[contador];
						 		System.out.print("Código : "+codProduto[contador]+"\nProduto : "+produto[contador]+"\nValor : "+preco[contador]+"\nEstoque : "+estoque[contador]);
						 		System.out.print("\n\nDigite a quantidade desejada : ");
						 		auxQuant = ler.nextInt();
						 		// VALIDAÇÕES DE QUANTIDADE DO PRODUTO SELECIONADO
						 		while (auxQuant<=0) {
						 		System.out.print("Valor inválido, digite novamente: ");
						 		auxQuant = ler.nextInt();
						 		}
						 		if (auxQuant > estoque[contador] && estoque[contador] == 0) {
						 			System.out.print("Produto em falta! Digite ' 0 'para prosseguir ");
						 			while (auxQuant > estoque[contador]) {
						 			auxQuant = ler.nextInt();	
						 			}
						 		}
						 		else if (auxQuant > estoque[contador]) {
						 			while (auxQuant > estoque[contador] && estoque[contador] <= 0) {
						 			System.out.print("\nDigite a quantidade mediante o estoque !");	
						 			System.out.print("\n\nDigite a quantidade desejada : ");
						 			auxQuant = ler.nextInt();
						 			}
						 		}
						 		break;	 				
						 	}
						} 
							// CARRINHO DURANTE A COMPRA
				 			for (contador = 0; contador < 10; contador++) {
				 				if (auxCod.equals(codProduto[contador])) {
				 				carrinhoCompras[contador] = auxQuant;
				 				tituloCarrinho();
				 					for (contador = 0; contador < 10; contador++) {
				 						if(carrinhoCompras[contador] != 0) {
				 							System.out.print("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+(carrinhoCompras[contador]*preco[contador])+"\t    ♥\n");			
				 						}
				 					}
				 				linha(false);
				 				}
				 			}
					 		// PERGUNTA SE DESEJA PROSSEGUIR COM A COMPRA
					 		do{
					 			System.out.print("Deseja continuar a compra [S/N] ?: ");
					 			continua = ler.next().toUpperCase().charAt(0);
					 		}while(continua != 'S' && continua != 'N');
					 		if(continua == 'S') {
					 			tituloTabela(); 
						 		for (contador = 0 ; contador < 10 ; contador++) {
						 			if (continua == 'S') {
					 				System.out.print("\n\t♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥");
						 			}
						 		}
						 		linha(true); 
					 		}
				 			
					}while (continua == 'S');
//FIM HENRIQUE 
//INÍCIO GIOVANNA 
					// CARRINHO FINAL 
					tituloCarrinho(); 
					for (contador = 0; contador < 10; contador++) {
						if (carrinhoCompras[contador] != 0) {
							System.out.printf("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+(carrinhoCompras[contador] * preco[contador])+"\t    ♥\n");
							total += carrinhoCompras[contador] * preco[contador];
						}
					}
					linha(false); 
					System.out.printf("VALOR DA COMPRA : %.2f",total);
					System.out.println("\n\nFORMAS DE PAGAMENTO : ");
					System.out.println("Opção [1] - Dinheiro á vista c/ 10% de desconto");
					System.out.println("Opção [2] - Cartão á vista c/ 10% de acréscimo");
					System.out.println("Opção [3] - Cartão em 2x c/ 15% de acréscimo");
					System.out.print("\nDigite a opção de pagamento : ");
					opcao = ler.nextInt();
					linhaNota(true); 			
					// OPÇÕES DE PAGAMENTO
					while (opcao >3 || opcao <=0) {
						System.out.println("Opção inválida, escolha novamente: ");
						System.out.println("\n\nFORMAS DE PAGAMENTO : ");
						System.out.println("Opção [1] - Dinheiro á vista c/ 10% de desconto");
						System.out.println("Opção [2] - Cartão á vista c/ 10% de acréscimo");
						System.out.println("Opção [3] - Cartão em 2x c/ 15% de acréscimo");
						System.out.print("\nDigite a opção de pagamento : ");
						opcao = ler.nextInt();
					}					
					// OPÇÃO 1 - À VISTA
					if (opcao == 1) {
						for (contador = 0; contador < 10; contador++) {
							if (carrinhoCompras[contador] != 0) {
								System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥");
							}
						}
						System.out.println("\nDinheiro à vista");
						System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
						System.out.println("10% de desconto : R$ "+df.format(total * 0.1));
						System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 0.9)+"\n");
						System.out.print("\t\t\t\t\tData de emissão : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
						linhaNota(false); 
					}
					// OPÇÃO 2 - À VISTA CARTÃO
					if (opcao == 2) {
						for (contador = 0; contador < 10; contador++) {
							if (carrinhoCompras[contador] != 0) {
								System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥");
							}
						}
						System.out.println("\nCartão à vista");
						System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
						System.out.println("10% de acréscimo : R$ "+df.format(total * 0.1));
						System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 1.1)+"\n");
						System.out.print("\t\t\t\t\tData de emissão : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
						linhaNota(false); 
					}	
					// OPÇÃO 3 - 2X NO CARTÃO
					else if (opcao == 3) {
						for (contador = 0; contador < 10; contador++) {
							if (carrinhoCompras[contador] != 0) {
								System.out.println("♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+carrinhoCompras[contador] * preco[contador]+"\t    ♥");
							}
						}
						System.out.println("\n2X no Cartão");
						System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
						System.out.println("15% de acréscimo : R$ "+df.format(total * 0.15));
						System.out.println("Valor da parcela : R$ "+df.format((total * 1.15)/2)+"\n");
						System.out.println("\nTOTAL DA COMPRA R$ " +df.format(total * 1.15)+"\n");
						System.out.print("\t\t\t\t\tData de emissão : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
						linhaNota(false); 
					}					
					// ZERAR VARIÁVEL QUE ACOMPANHA CARRINHO
					auxQuant=0;				
					contador=0;
					for (contador = 0; contador < 10; contador++) {
						verificarRepeticao[contador] = " ";
					}
					// ATUALIZA ESTOQUE PARA PRÓXIMA COMPRA
					for (contador = 0; contador < 10; contador++) {
						estoque[contador] -= carrinhoCompras[contador];
					}
					//ZERAR CARRINHO
					for (contador = 0; contador < 10; contador++) {
						carrinhoCompras[contador] = 0;		
						total = 0.0;
					}
				}
			else {
				break;
			}
			do{// PARA INICIAR OUTRA COMPRA E VOLTAR AO LOOP
				System.out.print("Deseja continuar a compra [S/N] ?: ");
				desejaVoltarParaSite = ler.next().toUpperCase().charAt(0);	
	 		}while(continua != 'S' && continua != 'N');
		}while (desejaVoltarParaSite == 'S');
		// NO CASO DO CLIENTE NÃO QUERER INICIAR A COMPRA OU UMA NOVA COMPRA
		System.out.println("Agradecemos a visita ♥\nVolte Sempre !!!\n");
	}
	
//FIM GIOVANNA
//INÍCIO MAICON

	//CABEÇALHO SITE
	public static void insereBanner() {
		System.out.println("\nwww.devsaudavel.com.br");
		System.out.println("\t\t\t\t*****DEV SAUDÁVEL*****");
		System.out.println("\t\t\t\tProgramando a sua saúde");
	}
	//CABEÇALHO TABELA
	public static void tituloTabela() {
		System.out.println("\n\t♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		System.out.println("\t♥\t\t\t    TABELA DE PRODUTOS\t\t\t\t   ♥");
		System.out.println("\t════════════════════════════════════════════════════════════════════════════ ");
		System.out.println("\t♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    ESTOQUE    ♥");
	}
	//CABEÇALHO CARRINHO
	public static void tituloCarrinho() {
		System.out.println("\n═════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("♥\t\t\t\t  CARRINHO DE COMPRAS\t\t\t\t\t    ♥");
		System.out.println("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
	}
	//CABEÇALHO CARRINHOFINAL
		public static void tituloCarrinhoFinal() {
			System.out.println("\n═════════════════════════════════════════════════════════════════════════════════════════════");
			System.out.println("♥\t\t\t\t  CARRINHO FINAL\t\t\t\t\t    ♥");
			System.out.println("\n♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
		}
	//LINHA INFERIOR 
	public static void linha(boolean forte){
		if(forte){// TABELA
			System.out.println("\n\t════════════════════════════════════════════════════════════════════════════");
		}
		else {// CARRINHO
			System.out.println("═════════════════════════════════════════════════════════════════════════════════════════════");
		}
	}
	//CABEÇALHO NOTA FISCAL
	public static void linhaNota (boolean forte){
		if (forte){
			System.out.println("\n======================================= NOTA FISCAL =========================================");
			System.out.println("www.devsaudavel.com.br");
			System.out.println("\t\t\t\t  *****DEV SAUDÁVEL*****");
			System.out.println("\t\t\t\t  Programando a sua saúde\n");
			System.out.println("♥    CÓDIGO\t♥\t PRODUTO\t♥    VALOR (R$)    ♥    QTDD    ♥     TOTAL (R$)    ♥");
		}
		else {// LINHA INFERIOR NOTA
			System.out.println("\n=============================================================================================\n");
		}
	}
//Fim MAICON
}