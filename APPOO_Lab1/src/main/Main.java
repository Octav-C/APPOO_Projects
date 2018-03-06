package main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	static String login;
	static String password;
	static Scanner scanner = new Scanner(System.in);
	static Public_Person person;
	public static void main(String[] args) throws InterruptedException, IOException {	
		person = new Public_Person("A","B",12345678,22, "qwerty");
		loginScreen();
		
	}
	
	public static void loginScreen() throws InterruptedException {
		System.out.println("----LOGIN TO INTERNET BANKING----");
		System.out.println("Introduce your Login details:");
		System.out.println("Login(Last Name):");
		login = scanner.nextLine();
		System.out.println("Password:");
		password = scanner.nextLine();
		System.out.println(login + " " + password);
		if (loginUser() == 1) {
			System.out.println("Login Successfully");
			Thread.sleep(2000);
			System.out.flush();;
			clearScreen(10);
			welcomeScreen();
		
		} else {
			System.out.println("Wrong login or password");
			Thread.sleep(2000);
			clearScreen(7);
			loginScreen();
		}
	}
	
	public static int loginUser() {
		if (person.getLast_name().equalsIgnoreCase(login) && person.getPassword().equalsIgnoreCase(password)) {
			return 1;
		} else return 0;
	}
	
	public static void welcomeScreen() {
		System.out.println("****Welcome to Internet Banking " + person.getFirst_name() + " " + person.getLast_name() + "****");
		System.out.println("Your account number is: " + person.getAccNumber());
	}
	
	public static void clearScreen(int n) {  
		int i =0;
		while(i<n) {
	    System.out.println(" ");  
	    i++;
		}
	} 

}
