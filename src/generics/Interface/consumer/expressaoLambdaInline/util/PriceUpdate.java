package generics.Interface.consumer.expressaoLambdaInline.util;

import java.util.function.Consumer;

import express�esLambda.interfaceFuncional.expressaoLambdaInline.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}