package generics.map;

import java.util.Map;
import java.util.TreeMap;

public class Tutorial {

	public static void main(String[] args) {

		/* criando Map para armazenar cookies com tipo da chave e valor do Map String
		 * iniciando ele como new TreeMap, como o tipo String ja tem implementado o equalsHashCode()
		 * e também o CaparableTo podemos usar o TreeMap diretamente.
		 */
		
		//TreeMap ordena pela chave e no caso de string a ordenação é em ordem alfabética
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria"); //Armazenando par e valor
		cookies.put("email", "maria@gmail.com");
		cookies.put("name", "Carlos");
		cookies.put("phone", "99771122");
		
		
		cookies.remove("email"); //remove email
		
				
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		//Imprimindo valores com for
		System.out.println("ALL COOKIES:"); 
		for (String key : cookies.keySet()) { 
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
		/* Map<K,V>
		 * • https://docs.oracle.com/javase/10/docs/api/java/util/Map.html
		 * • É uma coleção de pares chave / valor
		 * • Não admite repetições do objeto chave
		 * • Os elementos são indexados pelo objeto chave (não possuem posição)
		 * • Acesso, inserção e remoção de elementos são rápidos
		 * • Uso comum: cookies, local storage, qualquer modelo chave-valor
		 * 
		 * • Principais implementações: "Conceitos parecidos com Set"
		 * 
		 * • HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
		 * • TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
		 * 	 compareTo do objeto (ou Comparator)
		 * • LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
		 * 
		 * Alguns métodos importantes
		 * 
		 * • put(key, value) "insere um elemento em uma determinada chave inserindo o valor a essa chave",
		 *  remove(key),"remove elemento passando a chave",
		 *  containsKey(key) "verifica se contem uma determinada chave", 
		 *  get(key) "recupera um elemento pela chave"
		 *   
		 * • Baseado em equals e hashCode
		 * 
		 * • Se equals e hashCode não existir, é usada comparação de ponteiros
		 * 
		 * Operações:
		 * • clear() "Limpa um conjunto",
		 * • size() "Size para obter tamanho",
		 * 
		 * • keySet() - retorna um Set<K> "retorna as chaves contida em um Map"
		 * • values() - retornaa um Collection<V> "retorna uma coleção do tipo valor"
		 * 
		 */

