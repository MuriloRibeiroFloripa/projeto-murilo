package excecao_try_cattch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Tratamento de exceção com try-catch
 * O modelo de tratamento de exceções permite que erros sejam
 * tratados de forma consistente e flexível, usando boas práticas
*/

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Esta posição não existe, (Invalid position!)");
		} catch (InputMismatchException e) {
			System.out.println("Insira um valor Inteiro (Input error)");
		}
		System.out.println("End of program");
		sc.close();
	}
}