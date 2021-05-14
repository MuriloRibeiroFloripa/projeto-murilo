package funçãoObjetoPrimeiraOrdemOUordem.entities;

/* Entendimento
 * Quando se implementa com TreeSet a classe do Produto tem que ser uma implementação
 * do Comparable para que seja possivel para que o TreeSet ordene os seus Objetos 
 */

public class Product implements Comparable<Product> {
	String name;
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

	/*
	 * generate hastCode() and equal() "entao sim" ai os objetos farão a comparação
	 * entre os valores contidos no objeto e não mais pelo refencias de memoria que
	 * na comparação daria false inserindo hashCode() e equals(Object obj).
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	// compareTo cai compar por nome comparando um nome do produto com outro nome do
	// produto
	@Override
	public int compareTo(Product other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
}