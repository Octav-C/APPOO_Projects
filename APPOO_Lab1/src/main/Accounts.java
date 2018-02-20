package lab1;

public class Accounts {
	private long acc_number;

	
	Accounts (long acc_number){
		this.setAcc_number(acc_number);
	}

	public Accounts() {
		acc_number = 0;
	}

	public long getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}
	
	
}
