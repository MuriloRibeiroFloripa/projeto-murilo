package generics.set_Interface.metodoRemove;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>(); // mant�m a ordem que os elementos s�o inseridos

		set.add("TV"); // TV maiuscula vai ter prioridade por causa do "V" mai�culo
		set.add("Tv"); // n�o imprime repetidos
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.remove("Tv"); //remove Tv

		// testando se no conjunto existe o elemento Notebook
		System.out.println(set.contains("Notebook"));

		// imprimindo os elementos do conjunto
		for (String p : set) {
			System.out.println(p);
		}
	}
}