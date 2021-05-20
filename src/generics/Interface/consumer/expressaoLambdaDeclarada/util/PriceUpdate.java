package generics.Interface.consumer.expressaoLambdaDeclarada.util;

import java.util.function.Consumer;

import generics.Interface.consumer.expressaoLambdaDeclarada.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}