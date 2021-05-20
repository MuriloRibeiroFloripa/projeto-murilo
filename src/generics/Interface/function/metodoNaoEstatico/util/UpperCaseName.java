package generics.Interface.function.metodoNaoEstatico.util;

import java.util.function.Function;

import generics.Interface.function.metodoNaoEstatico.entities.Product;

public class UpperCaseName implements Function<Product, String> {
	
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}