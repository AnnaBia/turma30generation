package programas;

import entidades.Cachorro;
import entidades.Gato;
//classe generica, n�o pode instanciar, n�o pode ser criada dentro do programa
	public  class CadBichos {
	
		public static void main(String args[]) {
		
			Cachorro dog1 = new Cachorro("CANINO","DOBERMAN",'G',"FINA");
			Gato cat1 = new Gato("FELINO","ANGORRA",'M',"ALTA");

			dog1.somAlto();
			dog1.somBaixo();
		
			cat1.somAlto();
			cat1.somBaixo();
	
	}
	
}