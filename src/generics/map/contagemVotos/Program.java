package generics.map.contagemVotos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				} else {
					votes.put(name, count);
				}

				line = br.readLine();
			}

			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
/*Na contagem de votos de uma eleição, são gerados vários registros
 * de votação contendo o nome do candidato e a quantidade de votos
 * (formato .csv) que ele obteve em uma urna de votação. Você deve
 * fazer um programa para ler os registros de votação a partir de um
 * arquivo, e daí gerar um relatório consolidado com os totais de cada
 * candidato.
 * 
 * Insira os dados em um arquivo .csv coloque o caminho no console exemplo: c:\temp\in.txt
 * exemplo de dados
 * Alex Blue,15
 * Maria Green,22
 * Bob Brown,21
 * Alex Blue,30
 * Bob Brown,15
 * Maria Green,27
 * Maria Green,22
 * Bob Brown,25
 * Alex Blue,31
 */ 
