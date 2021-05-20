package generics.Interface.function.lambdaInline.util;

import java.util.function.Function;

import generics.Interface.function.lambdaInline.entities.Product;

public class UpperCaseName implements Function<Product, String> {
	
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}