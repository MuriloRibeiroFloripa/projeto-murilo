package herança.entities.sobreposição.superr;

public class BusinessAccount extends Account {
	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);// efetuei o saque normal
		balance -= 2.0; // descontar do saldo valor 2.0
	}
}