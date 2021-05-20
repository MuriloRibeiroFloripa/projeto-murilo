package generics.Interface.consumer.referencenNaoMetodoEstattico.util;

import java.util.function.Consumer;

import generics.Interface.consumer.referenceMetodoNaoEstattico.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
