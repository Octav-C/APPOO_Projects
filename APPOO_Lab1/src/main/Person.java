package main;

public class Person {
	private String first_name;
	private String last_name;
	private int age;
	private Accounts account = new Accounts();
	private String password;
	
	public Person (String first_name, String last_name,long account_num, int age, String password){
		if (age >=0) {
			this.first_name = first_name;
			this.last_name = last_name;
			this.age = age;
			this.password = password;
			this.account.setAcc_number(account_num);
			
		}
		else {
			System.out.println("Age is negative");
		}
	}

	public String getFirst_name () {
		return first_name;
	}
	
	public String getLast_name () {
		return last_name;
	}
	
	public int getAge () {
		return age;
	}
	
	public void setFirst_name (String first_name) {
		this.first_name = first_name;
	}
	
	public void setLast_name (String last_name) {
		this.last_name = last_name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public long getAccNumber() {
		return account.getAcc_number();
	}
	
	public void setAccNumber(long acc_number) {
		this.account.setAcc_number(acc_number);;
	}
}
