package arquivo.fileScanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*Lendo arquivo
 * texto com classes File e Scanner
 * Classes
 * • File - Representação abstrata de um arquivo e seu caminho
 * • https://docs.oracle.com/javase/10/docs/api/java/io/File.html
 * • Scanner - Leitor de texto
 * • https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
 * • IOException (Exception)
 * • https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html
 * */


public class Program {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Murilo Ribeiro\\Documents\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}