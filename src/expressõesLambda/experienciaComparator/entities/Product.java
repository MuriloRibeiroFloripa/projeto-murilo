package expressõesLambda.experienciaComparator.entities;

/* • com a classe Product tendo os atributos name e price.
 * • implementar a comparação desses produtos por meio da implementação da interface 
 *   Comparable<Product>
 * • torna a classe fechada para alteração: senão se tiver um critério
 *   de comparação que altera-se, precisaremos alterar essa classe Product também.
 * • usando o default method "sort" da interface List: 
 *   default void sort(Comparator<? super E> c) essa alteração só ira acontecer na classe principal
 *   tornando a aplicação uma Programação funcional.
 *   
 * • Documentação
 *    Comparator
 *    https://docs.oracle.com/javase/10/docs/api/java/util/Comparator.html
 *    Veja o método sort na interface List:
 *    https://docs.oracle.com/javase/10/docs/api/java/util/List.html
 */

//public class Product Implements Comparable<Product> {
public class Product {

	private String name;
	private Double price;

	public Product() {
	}

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

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	/* @verride
	 * public int compareTo(Product p) {
	 * 
	 * 		//logica de comparação entre produtos
	 * 		return name.toUpperCase().compareTo(p.getName().toUpperCase()); 
	 * }
	 */	
}