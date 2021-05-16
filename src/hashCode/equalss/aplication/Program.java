package hashCode.equalss.aplication;

/* hashCode e equals
 * São operações da classe Object utilizadas para comparar se um objeto
 * é igual a outro
 * equals: lento, porwm sua resposta é 100% confiavel
 * hashCode: rápido, porém resposta positiva não é 100%
 * Tipos comuns (String, Date, Integer, Double, etc.) já possuem
 * implementação para essas operações. Classes personalizadas
 * precisam sobrepô-las.
 * HashCode
 * Método que retorna um número inteiro representando um código gerado
 * a partir das informações do objeto 
 */

public class Program {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Alex";
		String c = "Maria";
		String d = "alex";

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());

		System.out.println();
		/*
		 * Equals Método que compara se o objeto é igual a outro, retornando boolean: true ou
		 * false.
		 */

		String a1 = "Maria";
		String b1 = "Alex";
		System.out.println(a1.equals(b1));
	}

}
