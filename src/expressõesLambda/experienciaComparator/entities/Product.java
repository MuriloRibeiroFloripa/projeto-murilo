package express�esLambda.experienciaComparator.entities;

/* � com a classe Product tendo os atributos name e price.
 * � implementar a compara��o desses produtos por meio da implementa��o da interface 
 *   Comparable<Product>
 * � torna a classe fechada para altera��o: sen�o se tiver um crit�rio
 *   de compara��o que altera-se, precisaremos alterar essa classe Product tamb�m.
 * � usando o default method "sort" da interface List: 
 *   default void sort(Comparator<? super E> c) essa altera��o s� ira acontecer na classe principal
 *   tornando a aplica��o uma Programa��o funcional.
 *   
 * � Documenta��o
 *    Comparator
 *    https://docs.oracle.com/javase/10/docs/api/java/util/Comparator.html
 *    Veja o m�todo sort na interface List:
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
	 * 		//logica de compara��o entre produtos
	 * 		return name.toUpperCase().compareTo(p.getName().toUpperCase()); 
	 * }
	 */	
}