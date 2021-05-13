package generics.set_Interface.metodoRemoveIf;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>(); // mantém a ordem que os elementos são inseridos

		set.add("TV"); // TV maiuscula vai ter prioridade por causa do "V" maiúculo
		set.add("Tv"); // não imprime repetidos
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		// Remove um predicado na forma x tal que x "alguma condição"
		set.removeIf(x -> x.length() <= 3); // remove todo elemento x tal que x.length seja menor que 3

		// remove todo elemento x tal tenha se inicia com a letra "T"
		set.removeIf(x -> x.charAt(0) == 'T');

		// Remove um predicado na forma x tal que x "alguma condição"

		// testando se no conjunto existe o elemento Notebook
		System.out.println(set.contains("Notebook"));

		// imprimindo os elementos do conjunto
		for (String p : set) {
			System.out.println(p);
		}
	}
}
