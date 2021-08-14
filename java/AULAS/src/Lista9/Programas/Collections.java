package Lista9.Programas;

import java.util.ArrayList;
import java.util.List;
import Lista9.Classes.Estoque;

public class Collections{
	public static void main(String[] args) {
		List<Estoque> lista = new ArrayList<>();
		
		lista.add(new Estoque("G-01","Lençol de baixo",50));
		lista.add(new Estoque("G-02","Lençol de cima",50));
		lista.add(new Estoque("G-03","Colcha",50));
		lista.add(new Estoque("G-04","Fronha",50));
		lista.add(new Estoque("G-05","Edredon",50));
		lista.add(new Estoque("G-06","Cobertor",50));
		
		System.out.print("Estoque inicial: \n");
		for(Estoque item : lista) {
			System.out.printf("CÓD : %s | ESTOQUE : %d| PRODUTO : %s\n",item.getCodigo(),item.getEstoque(),item.getProfuto());
		}
		lista.remove(5);
		
		System.out.print("\nEstoque com um item removido: \n");
		for(Estoque item : lista) {
			System.out.printf("CÓD : %s | ESTOQUE : %d| PRODUTO : %s\n",item.getCodigo(),item.getEstoque(),item.getProfuto());
		}
		lista.get(0).setEstoque(25);
		lista.get(1).setEstoque(25);
		lista.get(2).setEstoque(40);
		lista.get(3).setEstoque(25);
		lista.get(4).setEstoque(40);
		
		System.out.print("\nEstoque atual: \n");
		for(Estoque item : lista) {
			System.out.printf("CÓD : %s | ESTOQUE : %d| PRODUTO : %s\n",item.getCodigo(), item.getEstoque(),item.getProfuto());
		}
		 
	}
}
