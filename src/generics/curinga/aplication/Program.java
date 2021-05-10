package generics.curinga.aplication;

/*Tipos curinga (wildcard types)
 * Com tipos curinga podemos fazer métodos
 * que recebem um genérico de "qualquer tipo":
 * */

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Murilo", "Marcos", "Elza", "Tatiane");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}	
	/* public static void main(String[] args) {
	 * List<?> list = new ArrayList<Integer>();
	 * 		list.add(3); // erro de compilação "não posso adcionar"
	 *   }
	 * }
	 * O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.	 * 
	 */


/*
 * List<Object> não é o supertipo de qualquer tipo de lista: List<Object> myObjs
 * = new ArrayList<Object>(); List<Integer> myNumbers = new
 * ArrayList<Integer>(); myObjs = myNumbers; // erro de compilação
 * 
 * O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
 * List<?> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
 * ArrayList<Integer>(); myObjs = myNumbers;
 */