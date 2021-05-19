package expressõesLambda.interfaceFuncional.expressaoLambdaInline.util;

import java.util.function.Predicate;

import expressõesLambda.interfaceFuncional.expressaoLambdaInline.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
