package expressõesLambda.interfaceFuncional.metodoEstatico.application;

import java.util.ArrayList;
import java.util.List;

import expressõesLambda.interfaceFuncional.metodoEstatico.entities.Product;

/* Predicate
 * https://docs.oracle.com/javase/10/docs/api/java/util/function/Predicate.html
 * public interface Predicate<T> {
 *     boolean test (T t);
 * }
 * Predicate é uma interface genercs parametrizado com tipo T, que contem
 * apenas um metodo abstrato chamdo teste.
 * esse metodo teste vai receber um objeto do tipo T e retornar um boolean.
 * 
 * Predicate (exemplo com removeIf)
 * */

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//referencia para metodos
		list.removeIf(Product::staticProductPredicate);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
