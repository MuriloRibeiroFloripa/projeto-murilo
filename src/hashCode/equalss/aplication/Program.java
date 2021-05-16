package hashCode.equalss.aplication;

/* hashCode e equals
 * S�o opera��es da classe Object utilizadas para comparar se um objeto
 * � igual a outro
 * equals: lento, porwm sua resposta � 100% confiavel
 * hashCode: r�pido, por�m resposta positiva n�o � 100%
 * Tipos comuns (String, Date, Integer, Double, etc.) j� possuem
 * implementa��o para essas opera��es. Classes personalizadas
 * precisam sobrep�-las.
 * HashCode
 * M�todo que retorna um n�mero inteiro representando um c�digo gerado
 * a partir das informa��es do objeto 
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
		 * Equals M�todo que compara se o objeto � igual a outro, retornando boolean: true ou
		 * false.
		 */

		String a1 = "Maria";
		String b1 = "Alex";
		System.out.println(a1.equals(b1));
	}

}
