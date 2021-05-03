package generics.reusoTypeSafePerformance.aplication;

import java.util.Scanner;

import generics.reusoTypeSafePerformance.services.PrintService;

/*
 * Generics
 * • Generics permitem que classes, interfaces e métodos possam ser
 * parametrizados por tipo. Seus benefícios são:
 * • Reuso
 * • Type safety
 * • Performance
 * • Uso comum: coleções
 * */

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// lista recebe valares inteiros
		PrintService<Integer> ps = new PrintService<>();
		// para receber valores Strings
		// PrintService<String> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			// String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		// String x = ps.first();
		System.out.println("First: " + x);

		sc.close();
	}
}
