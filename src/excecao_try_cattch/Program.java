package excecao_try_cattch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Tratamento de exce��o com try-catch
 * O modelo de tratamento de exce��es permite que erros sejam
 * tratados de forma consistente e flex�vel, usando boas pr�ticas
*/

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Esta posi��o n�o existe, (Invalid position!)");
		} catch (InputMismatchException e) {
			System.out.println("Insira um valor Inteiro (Input error)");
		}
		System.out.println("End of program");
		sc.close();
	}
}