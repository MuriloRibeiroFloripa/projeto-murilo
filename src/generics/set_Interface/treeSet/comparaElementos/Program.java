package generics.set_Interface.treeSet.comparaElementos;

import java.util.Set;
import java.util.TreeSet;

/*Recordando as implementa��es
 * � Principais implementa��es:
 * � HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
 * � TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado
 * pelo compareTo do objeto (ou Comparator)
 * � LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o
 * adicionados
 * 
 */

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		// imprimir produtos
		for (Product p : set) {
			System.out.println(p);

		}

	}
}
