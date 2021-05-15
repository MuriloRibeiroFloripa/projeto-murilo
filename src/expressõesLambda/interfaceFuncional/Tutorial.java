package express�esLambda.interfaceFuncional;

public class Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/* Interface funcional
 * � uma interface que possui um �nico m�todo abstrato. Suas
 * implementa��es ser�o tratadas como express�es lambda.
 * 
 * interface Comparator uma interface funcional que possui s� um metodo exeemplo.
 * classe que implementa a interface e com a implementa��o do metodo interface que pode passar um objeto
 * public class MyComparator implements Comparator<Product> {
 * 		@Override
 * 		public int compare(Product p1, Product p2) {
 * 			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
 * 		}
 * }
 * 
 * passando um objeto da classe MyComparator como argumento da funtion sort, 
 * objeto que depois pode ser substituido por uma express�o Lambda que na linguagem
 * java eles s�o equivalente.
 * public static void main(String[] args) {
 * 		(...)
 * 		list.sort(new MyComparator());
 * }
 * Na interface java ela tem um mapeamento direto com a express�o Lambda 
 * no fundo essa express�o lambda vai ser tratada como uma interface, 
 * no caso uma interface funcional. Que tem s� um metodo Abstrato.
 * mantem um mapeamento entre a orienta��o a objetos com interfaces e a programa��o funcional.
 * 
 * ja existem no Java varias linguagens funcionais comuns:
 * � Predicate
 * � https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
 * � Function
 * � https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
 * � Consumer
 * � https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
 * � Nota: ao contr�rio das outras interfaces funcionais, no caso do Consumer, �
 * esperado ele possa gerar efeitos colaterais, porque � um metodo void, simplesmente ele 
 * faz uma a��o, a��o que pode ser qualquer coisa, imprimir na tela, alterar valor de alguma 
 * coisa que esta fora da fun��o, logo � mais esperado que neste caso ela cause efeitos colaterais.
 * por�m � uma exce��o
 */