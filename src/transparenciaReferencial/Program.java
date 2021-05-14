package transparenciaReferencial;

import java.util.Arrays;

/* Uma função possui transparência referencial se seu resultado for sempre o mesmo
 * para os mesmos dados de entrada. Benefícios: simplicidade e previsibilidade.
 * Este Program é um exemplo de função que não é referencialmente transparente porque 
 * o comportamento da funçaõ changeOddValues(vect) não depende exclusivamente do que
 * o que esta na propria função ele depende de um valor externo Variavel globalValue = 3
 * por isso esse programa não tem transparencia referencial.
 * */

public class Program {

	public static int globalValue = 3;

	public static void main(String[] args) {
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}
