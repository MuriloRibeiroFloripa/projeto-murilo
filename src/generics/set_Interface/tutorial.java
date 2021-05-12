package generics.set_Interface;

public class tutorial {

	public static void main(String[] args) {
		
		System.out.println("Ola mundo!");
	}
	/* Set<T>
	 * � Representa um conjunto de elementos (similar ao da �lgebra)
	 * � N�o admite repeti��es
	 * � Elementos n�o possuem posi��o
	 * � Acesso, inser��o e remo��o de elementos s�o r�pidos
	 * � Oferece opera��es eficientes de conjunto: interse��o, uni�o, diferen�a.
	 * 
	 * 		� https://docs.oracle.com/javase/10/docs/api/java/util/Set.html
	 * 		na verdade Set<t> � uma interface com algumas inplementa��es
	 * 		que irei fazer os testes aqui 
	 * 
	 * � Principais implementa��es:
	 *	 � HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
	 * 	 � TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo
	 *     compareTo do objeto (ou Comparator)
	 *   � LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o adicionados
	 * 
	 * 
	 * Alguns m�todos importantes
	 * � add(obj) - "adicionar", remove(obj) - "remover", contains(obj) - "verificar se o elemento existe"
	 * � para todas as opera��es vc passa o objeto que ira se
	 * � Baseado em equals e hashCode
	 * � Se equals e hashCode n�o existir, � usada compara��o de ponteiros
	 * � opera��es:
	 * 	� clear() - "Esvazia o conjunto"
	 * 	� size() - "Retorna o tamanho do conjunto"
	 * 	� removeIf(predicate) - "Remove do conjunto todo mundo que atender o predicado"
	 *  � addAll(other) - uni�o: adiciona no conjunto os elementos do outro conjunto, sem repeti��o
	 *  � retainAll(other) - interse��o: remove do conjunto os elementos n�o contitos em other
	 *  � removeAll(other) - diferen�a: remove do conjunto os elementos contidos em other
	 */	
}
		
		