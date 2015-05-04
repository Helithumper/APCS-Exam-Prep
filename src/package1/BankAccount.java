package package1;

public class BankAccount {
	private String owner;
	private int identifier;
	private int pin;
	private double balance;
	private double interestRate;

	public BankAccount(String owner, int pin) {
		this.owner = owner;
		this.pin = pin;
		this.balance = 0.0;
		this.interestRate = .01;
	}

	public void compoundInterest() {
		/* Implement */
	}

	public double getBalance() {
		return balance;
	}

}
