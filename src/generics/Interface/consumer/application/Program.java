package generics.Interface.consumer.application;

/** • Consumer
 * • https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
 * • Nota: ao contrário das outras interfaces funcionais (function, predicate), no caso do Consumer, é
 * esperado ele possa gerar efeitos colaterais
 * 
 * public interface Consumer<T> {
 * void accept (T t);
 * }
 * 
 * Programa que, a partir de uma lista de produtos, aumente o preço dos produtos em 10%.
 * 
 */

import  java.util.ArrayList ;
import  java.util.List ;

import generics.Interface.consumer.entities.Product;
import generics.Interface.consumer.util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(new PriceUpdate());

		//Reference method
		list.forEach(System.out::println);
	}
}