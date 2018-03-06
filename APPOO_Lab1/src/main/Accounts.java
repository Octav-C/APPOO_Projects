package main;

public class Accounts {
	private long acc_number;
	private double balance;
	
	public Accounts() {
		balance = 0;
	}
	public long getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
}
