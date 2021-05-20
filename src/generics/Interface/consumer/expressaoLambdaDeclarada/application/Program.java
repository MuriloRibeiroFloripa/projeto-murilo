package generics.Interface.consumer.expressaoLambdaDeclarada.application;

import  java.util.ArrayList ;
import  java.util.List ;
import java.util.function.Consumer;

import generics.Interface.consumer.expressaoLambdaDeclarada.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// legal podemos declar uma variavel que pode ser lida pelo usuario
		double factor = 1.1;
		
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};
		
		list.forEach(cons);
	}
}