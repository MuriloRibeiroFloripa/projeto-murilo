package heran�a_application.sobreposi��o;

import heran�a_entities.sobreposi��o.Account;
import heran�a_entities.sobreposi��o.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Marcos", 1000.0);
		acc1.withdraw(200);//saque com desconto de 5.0
		System.out.println("Saldo: "+acc1.getBalance());
		
		//testando a sobreposi��o
		// saldo n�o pode descontar 5.0
		
		Account acc2 = new SavingsAccount(1002, "Alessandro", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println("Saldo: "+acc2.getBalance());
	}
}