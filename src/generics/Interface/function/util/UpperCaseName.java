package generics.Interface.function.util;

import java.util.function.Function;

import generics.Interface.function.entities.Product;

/* 
 * public interface Function<T, R> {
 * 	R apply (T t);
 * }
 * 
 */

public class UpperCaseName implements Function<Product, String> {
	
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
		
	}
}