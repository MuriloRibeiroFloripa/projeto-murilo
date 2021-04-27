package exceção.printStrackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Pilha de chamadas de métodos
 * Pilha de chamadas de métodos vi mostrar toda a chamada de metodos 
 * que ocasionaram a exceção
 *  */

public class Program {
	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();// Pilha de chamadas de métodos
			sc.next();
		} 
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}