package InterfaceVideo;

public class TesteInterface {
	public static void main (String args[]) {
		//chama o ParticpanteForum, cria um objeto chamado participante e instancia ele
		ParticipanteForum participante = new ParticipanteForum();//instanciamento
		//como que eu sei quo participante é o participante fórum?
		Leitor leitor = participante;
															//.lendo chama o metodo 
		System.out.println("O participante está lendo : " + leitor.lendo());
		//como que eu sei quo participante é o participante fórum?
		Programador programador = participante;
		String java = "JAVA";
		//o metodo pensando vem lá da classe programador,.toCharArray cria uma class do tipo array e converte
		programador.pensando(java.toCharArray());//convertendo
		//o digitando chama o pensando
		System.out.println(" E programando : "+programador.digitando());
	}
}
