package generics.set_Interface.unionIntersectionDifference;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//Generics Set com operações de conjuntos union, intersection, difference

public class Program {

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		System.out.println("Conjunto A: " + a);
		System.out.println("Conjunto B: " + b);
		System.out.println();
		
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("Union: Entre os conjuntos A e B");
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Intersection: Entre os conjuntos A e B");
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Difference: Entre os conjuntos A e B");
		System.out.println(e);
	}

}
