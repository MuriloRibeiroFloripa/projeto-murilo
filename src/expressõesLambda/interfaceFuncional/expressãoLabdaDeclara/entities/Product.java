package expressõesLambda.interfaceFuncional.expressãoLabdaDeclara.entities;

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

	// criando metodo estatico metodo que pega um produto e retorna um boolean
	// tem que passar um argumento para ele.
	//aceita referencia para metodo tem que passar um argumento para ele
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	// versão não Statica do metodo 
	// tem que instanciar o metodo para trabalhar com o proprio objeto onde estiver
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
