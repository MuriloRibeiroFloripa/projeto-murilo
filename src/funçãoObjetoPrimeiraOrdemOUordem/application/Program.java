package fun��oObjetoPrimeiraOrdemOUordem.application;

import java.util.ArrayList;
import java.util.List;

/* 
 * Fun��es s�o objetos de primeira ordem (ou primeira classe)
 * Isso significa que fun��es podem, por exemplo, serem passadas como par�metros de
 * m�todos, bem como retornadas como resultado de m�todos.
 * Utilizamos aqui
 * "method references"
 * Operador ::
 * Sintaxe:
 * Classe::m�todo * 
 */

import fun��oObjetoPrimeiraOrdemOUordem.entities.Product;

public class Program {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));		
		
		// passando como argumento para outras e tambem pode ser retornado por uma fun�oes
		// comum de acontercer na programa��o funcional.
		list.sort(Program::compareProducts);
		
		list.forEach(System.out::println);
	}
}