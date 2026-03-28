package com.ilp.tcs;

class BankAccount{
	int accountNumber;
	String accountHolderName;
	double balance;
	String accountType;
	
	//Constructor
	BankAccount(int accountNumber,String accountHolderName, double balance,String accountType  ){
		this.accountNumber = accountNumber;
		this.accountHolderName= accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}
	//Display details
	void displayDetails() {
		System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("---------------------------");
	}
}
public class BankDemo {
	public static void main(String args[]) {
		BankAccount ba1 = new BankAccount(223,"Sibangi",245678990, "Savings");
		BankAccount ba2 = new BankAccount(224,"Seetal",345678990, "Current");
		ba1.displayDetails();
		ba2.displayDetails();
	}
}
