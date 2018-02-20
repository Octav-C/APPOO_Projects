package lab1;

public class Juridic_Person extends Person {
	double fee = 0.05;
	Juridic_Person (String name, String surname, int age){
		super(name, surname, age);
	}
	void setFee (double fee) {
		this.fee = fee;
	}
	double getFee() {
		return fee;
	}
}
