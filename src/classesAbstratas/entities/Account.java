package classesAbstratas.entities;

/*Suponha que em um neg�cio relacionado a banco, apenas
contas poupan�a e contas para empresas s�o permitidas.
N�o existe conta comum.
Para garantir que contas comuns n�o possam ser
instanciadas, basta acrescentarmos a palavra "abstract" na
declara��o da classe.*/

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