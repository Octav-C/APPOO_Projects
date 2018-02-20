package lab1;

public class Public_Person extends Person {
	double fee = 0.02;
	Public_Person (String name, String surname, int age){
		super(name, surname, age);
	}
	void setFee (double fee) {
		this.fee = fee;
	}
	double getFee() {
		return fee;
	}
}
