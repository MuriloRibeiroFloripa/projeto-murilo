package generics.set_Interface.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); // HashSet é o mais rapido de todos, porem não garante a ordem

		set.add("TV");
		set.add("Tv"); // não imprime repetidos
		set.add("Tv"); // não garante a ordem
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
