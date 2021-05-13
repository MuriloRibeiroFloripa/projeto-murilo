package generics.set_Interface.setTestaIgualdade;

import java.util.HashSet;
import java.util.Set;

/* Como as cole��es Hash testam igualdade?
 * � Se hashCode e equals estiverem implementados:
 * � Primeiro hashCode. Se der igual, usa equals para confirmar.
 * � Lembre-se: String, Integer, Double, etc. j� possuem equals e hashCode
 * � Se hashCode e equals N�O estiverem implementados:
 * � Compara as refer�ncias (ponteiros) dos objetos.
 * 
 */

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		// testando se o produto Notebook contem na lista, aqui esta com
		// generate hastCode() and equal().
		// Sen�o daria false pois compararia os valores da referencia da memoria
		// assim que o set faz a compara��o para remover inserir e testar se cont�m.
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod));
	}

}
