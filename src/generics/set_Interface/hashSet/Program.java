package generics.set_Interface.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); // HashSet � o mais rapido de todos, porem n�o garante a ordem

		set.add("TV");
		set.add("Tv"); // n�o imprime repetidos
		set.add("Tv"); // n�o garante a ordem
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
