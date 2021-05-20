package generics.Interface.consumer.referenceMetodoEstattico.util;

import java.util.function.Consumer;

import generics.Interface.consumer.referenceMetodoEstattico.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
