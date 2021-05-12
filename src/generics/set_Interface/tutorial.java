package generics.set_Interface;

public class tutorial {

	public static void main(String[] args) {
		
		System.out.println("Ola mundo!");
	}
	/* Set<T>
	 * • Representa um conjunto de elementos (similar ao da Álgebra)
	 * • Não admite repetições
	 * • Elementos não possuem posição
	 * • Acesso, inserção e remoção de elementos são rápidos
	 * • Oferece operações eficientes de conjunto: interseção, união, diferença.
	 * 
	 * 		• https://docs.oracle.com/javase/10/docs/api/java/util/Set.html
	 * 		na verdade Set<t> é uma interface com algumas inplementações
	 * 		que irei fazer os testes aqui 
	 * 
	 * • Principais implementações:
	 *	 • HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
	 * 	 • TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
	 *     compareTo do objeto (ou Comparator)
	 *   • LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
	 * 
	 * 
	 * Alguns métodos importantes
	 * • add(obj) - "adicionar", remove(obj) - "remover", contains(obj) - "verificar se o elemento existe"
	 * • para todas as operações vc passa o objeto que ira se
	 * • Baseado em equals e hashCode
	 * • Se equals e hashCode não existir, é usada comparação de ponteiros
	 * • operações:
	 * 	• clear() - "Esvazia o conjunto"
	 * 	• size() - "Retorna o tamanho do conjunto"
	 * 	• removeIf(predicate) - "Remove do conjunto todo mundo que atender o predicado"
	 *  • addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição
	 *  • retainAll(other) - interseção: remove do conjunto os elementos não contitos em other
	 *  • removeAll(other) - diferença: remove do conjunto os elementos contidos em other
	 */	
}
		
		