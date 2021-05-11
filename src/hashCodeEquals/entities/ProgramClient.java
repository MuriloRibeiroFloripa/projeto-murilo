package hashCodeEquals.entities;

public class ProgramClient {

	public static void main(String[] args) {

		// se comparar somente pelo nome n�o � um bom metodo de compara��o
		// caso existam 2 Marias porem pessoas diferente
		// o correto entao � comparar nome e email dois criterios de compara��o.

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		String s4 = new String("Test");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("O conte�do dos Objetos S�o iguais? " + c1.equals(c2));

		// aqui ele n�o vai comparar
		// o valores o conte�do mas sim as referencias de memoria.
		System.out.println("Objetos S�o iguais? " + (c1 == c2));

		// para literais o compilador faz um tratamento especial e compara os valores
		// das variaveis
		System.out.println(s1 == s2);

		// para objetos ele vai comparar a referencia de memoria dos objetos
		System.out.println(s3 == s4);
	}
	/*
	 * Para comparar os conteudos dos objetos usamos equals, porem se for comparar
	 * as referencias de memoria coloca-se o ==
	 */
}
