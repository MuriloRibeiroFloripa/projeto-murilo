package herança.application;

import herança.entities.Account;
import herança.entities.BusinessAccount;
import herança.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 5000.0, 500.0);

		System.out.println("Saldo da conta: " + account.getBalance());
		System.out.println("Titular da conta: " + account.getHolder());
		System.out.println("Limite da conta: " + account.getLoanLimit());
		System.out.println("Numero da conta: " + account.getNumber());

		Account acc = new Account(1001, "Alex", 600.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 900.0, 500.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 350.0, 1000.0);

		System.out.println(acc.getHolder());
		System.out.println(acc1.getHolder());
		System.out.println(acc2.getHolder());
		System.out.println(acc3.getHolder());

		// DOWCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);// emprestimo

		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Realizei um Emprestimo! ");
		} // acc3 não é instância de businessAccount, if falhou!

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Saldo Atualizado");
		}
	}
}