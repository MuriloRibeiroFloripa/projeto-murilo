package arquivo.blocoTryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Bloco try-with-resources
 * • É um bloco try que declara um ou mais recursos, e garante que esses
 * recursos serão fechados ao final do bloco
 * • Disponível no Java 7 em diante
 * • https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
 * */

public class Program {
	public static void main(String[] args) {
		String path = "C:\\temp\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}