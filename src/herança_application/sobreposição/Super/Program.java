package heran�a_application.sobreposi��o.Super;

import heran�a_entities.sobreposi��o.Super.Account;
import heran�a_entities.sobreposi��o.Super.BusinessAccount;
import heran�a_entities.sobreposi��o.Super.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//Saque direto da superclasse 
		Account acc1 = new Account(1001, "Marcos", 1000.0);
		acc1.withdraw(200);//saque com desconto de 5.0
		System.out.println("Saldo: "+acc1.getBalance());
		
		//testando a sobreposi��o
		// saldo n�o pode descontar 5.0
		
		Account acc2 = new SavingsAccount(1002, "Alessandro", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println("Saldo: "+acc2.getBalance());
		
		//chamar a implementa��o da superclasse usando a palavra super
		//Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja realizar o
		//saque normalmente da superclasse, e descontar mais 2.0.
		// 5.0 + 2.0 = 7.0
		
		Account acc3 = new BusinessAccount(1003, "Bobe", 1000.0, 500.0);
		acc3.withdraw(200);
		System.out.println("Saldo: "+acc3.getBalance());		
	}
}