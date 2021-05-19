package express�esLambda.interfaceFuncional.metodoEstatico.util;

import java.util.function.Predicate;

import express�esLambda.interfaceFuncional.metodoEstatico.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
