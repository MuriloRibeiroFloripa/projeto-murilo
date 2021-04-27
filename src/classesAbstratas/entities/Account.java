package classesAbstratas.entities;

/*Suponha que em um negócio relacionado a banco, apenas
contas poupança e contas para empresas são permitidas.
Não existe conta comum.
Para garantir que contas comuns não possam ser
instanciadas, basta acrescentarmos a palavra "abstract" na
declaração da classe.*/

public abstract class Account {

	private Integer number;
	private String holder;
	protected Double balance;
		
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public void deposit(double amount) {
		balance += amount;
	}
}