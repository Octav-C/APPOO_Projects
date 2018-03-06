package main;

public class Public_Person extends Person {
	private double fee = 0.02;
	Public_Person (String first_name, String last_name,long account_num, int age, String password){
		super(first_name, last_name,account_num, age, password);
	}
	void setFee (double fee) {
		this.fee = fee;
	}
	double getFee() {
		return fee;
	}
}
