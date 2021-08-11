package Application;

import Entities.Cachorro;
import Entities.Gato;
import Entities.Pet;

public class TestePet {

	public static void main(String[] args) {
		Cachorro pet1 = new Cachorro("PITBULL",2019,true);//true or false
		Gato pet2 = new Gato("SIAMES",2014,false);
		
		System.out.println(pet1.getRaca() + " "+ pet1.idade()+" anos");
		
		System.out.println(pet2.getRaca() + " "+ pet2.idade()+" anos");
		pet2.somBaixo();
	}

}
