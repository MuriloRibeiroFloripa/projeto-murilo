package arquivo.fileReaderBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Classes
 * � FileReader (stream de leitura de caracteres a partir de arquivos)
 * � https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html
 * � BufferedReader (mais r�pido)
 * � https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html
 * � https://stackoverflow.com/questions/9648811/specific-difference-betweenbufferedreader-
 * and-filereader
 * */

public class Program {
	public static void main(String[] args) {
		String path = "C:\\temp\\in.txt";
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}