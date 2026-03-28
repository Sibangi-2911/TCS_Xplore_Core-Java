package com.ilp.tcs;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private String type;
	
	Account(){
		accountNumber = 1;
		accountHolderName = "Sibangi";
		balance = 1000;
		type = "Savings";
	}
	Account(int accountNumber,String accountHolderName,double balance,String type){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.type = type;
	}
	
	Account(int accountNumber,String accountHolderName){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 5000;
		this.type = "CurrentAccount";
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
