package Lista9.Programas;

import Lista9.Classes.Cachorro;
import Lista9.Classes.Cavalo;
import Lista9.Classes.Preguica;

public class TesteAnimal {
	public static void main(String args[]) {
		
		Cachorro animal1 = new Cachorro ("Simba", 14);
		Cavalo animal2 = new Cavalo ("Spirit",8);
		Preguica animal3 = new Preguica ("Zubumafu",5);
		
		System.out.println("Nome : " + animal1.getNome() + "\nIdade : " + animal1.getIdade() + " anos");
		animal1.movimento();
		animal1.emitirSom();
		animal1.som();
		System.out.println("\nNome : " + animal2.getNome() + "\nIdade : " + animal2.getIdade() + " anos");
		animal2.movimento();
		animal2.emitirSom();
		animal2.som();
		System.out.println("\nNome : " + animal3.getNome() + "\nIdade : " + animal3.getIdade() + " anos");
		animal3.movimento();
		animal3.emitirSom();
		animal3.som();
	}

}
