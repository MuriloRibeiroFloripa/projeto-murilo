package express�esLambda.interfaceFuncional.predicate.util;

import java.util.function.Predicate;

import express�esLambda.interfaceFuncional.predicate.entities.Product;


public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
