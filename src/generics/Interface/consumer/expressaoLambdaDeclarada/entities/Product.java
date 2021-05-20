package generics.Interface.consumer.expressaoLambdaDeclarada.entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	// metodo não estatico, não recebe argumento,
	// meche com price do proprio objeto
	public void nonStaticPriceUpdate() {
		// setPrice(getPrice() * 1.1);
		price = price * 1.1;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}