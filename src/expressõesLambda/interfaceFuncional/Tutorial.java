package expressõesLambda.interfaceFuncional;

public class Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/* Interface funcional
 * É uma interface que possui um único método abstrato. Suas
 * implementações serão tratadas como expressões lambda.
 * 
 * interface Comparator uma interface funcional que possui só um metodo exeemplo.
 * classe que implementa a interface e com a implementação do metodo interface que pode passar um objeto
 * public class MyComparator implements Comparator<Product> {
 * 		@Override
 * 		public int compare(Product p1, Product p2) {
 * 			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
 * 		}
 * }
 * 
 * passando um objeto da classe MyComparator como argumento da funtion sort, 
 * objeto que depois pode ser substituido por uma expressão Lambda que na linguagem
 * java eles são equivalente.
 * public static void main(String[] args) {
 * 		(...)
 * 		list.sort(new MyComparator());
 * }
 * Na interface java ela tem um mapeamento direto com a expressão Lambda 
 * no fundo essa expressão lambda vai ser tratada como uma interface, 
 * no caso uma interface funcional. Que tem só um metodo Abstrato.
 * mantem um mapeamento entre a orientação a objetos com interfaces e a programação funcional.
 * 
 * ja existem no Java varias linguagens funcionais comuns:
 * • Predicate
 * • https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
 * • Function
 * • https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
 * • Consumer
 * • https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
 * • Nota: ao contrário das outras interfaces funcionais, no caso do Consumer, é
 * esperado ele possa gerar efeitos colaterais, porque é um metodo void, simplesmente ele 
 * faz uma ação, ação que pode ser qualquer coisa, imprimir na tela, alterar valor de alguma 
 * coisa que esta fora da função, logo é mais esperado que neste caso ela cause efeitos colaterais.
 * porém é uma exceção
 */