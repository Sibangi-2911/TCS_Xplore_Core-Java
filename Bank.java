package com.ilp.tcs;

public class Bank {
	public static void main(String args[]) {
		Account account1 = new Account(1,"Ritika",1000,"Savings");
		account1.setBalance(4000);
		account1.setAccountHolderName("Sibangi");
		
		Account account2 = new Account(2, "Seetal", 2000, "Savings");
		
		
		System.out.println("AccountNumber="+account1.getAccountNumber());
		System.out.println("Account Holder Name= "+account1.getAccountHolderName());
		System.out.println("Account Balance = "+account1.getBalance());
		System.out.println("AccountType="+account1.getType());
		
		System.out.println("AccountNumber="+account2.getAccountNumber());
		System.out.println("Account Holder Name= "+account2.getAccountHolderName());
		System.out.println("Account Balance = "+account2.getBalance());
		System.out.println("AccountType="+account2.getType());
	}
}
