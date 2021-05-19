package express�esLambda.interfaceFuncional.metodoNaoEstatico.util;

import java.util.function.Predicate;

import express�esLambda.interfaceFuncional.metodoNaoEstatico.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
