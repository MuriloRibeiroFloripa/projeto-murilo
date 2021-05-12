package generics.set_Interface.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(); // TreeSet imprime na ordem

		set.add("TV"); // TV maiuscula vai ter prioridade por causa do "V" maiúculo
		set.add("Tv"); // não imprime repetidos
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		// testando se no conjunto existe o elemento Notebook
		System.out.println(set.contains("Notebook"));

		// imprimindo os elementos do conjunto
		for (String p : set) {
			System.out.println(p);
		}
	}
}
