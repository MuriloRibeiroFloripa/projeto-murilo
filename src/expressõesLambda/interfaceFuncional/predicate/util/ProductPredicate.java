package expressõesLambda.interfaceFuncional.predicate.util;

import java.util.function.Predicate;

import expressõesLambda.interfaceFuncional.predicate.entities.Product;


public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
