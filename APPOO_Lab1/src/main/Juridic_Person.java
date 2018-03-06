package main;

public class Juridic_Person extends Person {
	private double fee = 0.05;
	Juridic_Person (String first_name, String last_name,long account_num, int age, String password){
		super(first_name, last_name, account_num,age,password);
	}
	void setFee (double fee) {
		this.fee = fee;
	}
	double getFee() {
		return fee;
	}
}
