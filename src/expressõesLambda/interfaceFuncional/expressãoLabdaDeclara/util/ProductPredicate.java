package expressõesLambda.interfaceFuncional.expressãoLabdaDeclara.util;

import java.util.function.Predicate;

import expressõesLambda.interfaceFuncional.expressãoLabdaDeclara.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
