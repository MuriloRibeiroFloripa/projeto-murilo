package funçãoObjetoPrimeiraOrdem.application;

import java.util.ArrayList;
import java.util.List;

import funçãoObjetoPrimeiraOrdem.entities.Product;

public class Program {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));		
		
		// passando como argumento para outras e tambem pode ser retornado por uma funçoes
		// comum de acontercer na programação funcional.
		list.sort(Program::compareProducts);
		
		list.forEach(System.out::println);
	}
}