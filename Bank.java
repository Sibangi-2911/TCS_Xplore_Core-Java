package com.ilp.tcs;

public class Bank {
	public static void main(String args[]) {
		Account account1 = new Account(1,"Ritika",1000,"Savings");
		account1.setBalance(4000);
		account1.setAccountHolderName("Sibangi");
		
		
		
		System.out.println("AccountNumber="+account1.getAccountNumber());
		System.out.println("Account Holder Name= "+account1.getAccountHolderName());
		System.out.println("Account Balance = "+account1.getBalance());
		System.out.println("AccountType="+account1.getType());
		
		Bank bank = new Bank();
		
		double balanceWithInterest = bank.calculateInterest(account1.getBalance(), 12);
		account1.setBalance(balanceWithInterest);
		System.out.println("Account1 details after interest calculation: ");
		System.out.println("AccountNumber="+account1.getAccountNumber());
		System.out.println("Account Holder Name= "+account1.getAccountHolderName());
		System.out.println("Account Balance = "+account1.getBalance());
		System.out.println("AccountType="+account1.getType());
		
		
		Account account2 = new Account(2, "Seetal");
		System.out.println("AccountNumber="+account2.getAccountNumber());
		System.out.println("Account Holder Name= "+account2.getAccountHolderName());
		System.out.println("Account Balance = "+account2.getBalance());
		System.out.println("AccountType="+account2.getType());
		
		double balanceWithCompoundInterest = bank.calculateInterest(account2.getBalance(), 12, 4);
		account2.setBalance(balanceWithCompoundInterest);
		System.out.println("Account2 details after interest calculation: ");
		System.out.println("AccountNumber="+account2.getAccountNumber());
		System.out.println("Account Holder Name= "+account2.getAccountHolderName());
		System.out.println("Account Balance = "+account2.getBalance());
		System.out.println("AccountType="+account2.getType());
		
		
	}
	
	public double calculateInterest(double principal, float rateOfInterest) {
		double principalAfterInterest;
		principalAfterInterest = principal + principal*rateOfInterest/100;
		return principalAfterInterest;
	}
	public double calculateInterest(double principal, float rateOfInterest, int numberOfTimesCompunded) {
		double principalAfterInterest = principal *Math.pow(1+rateOfInterest/(numberOfTimesCompunded*100),numberOfTimesCompunded);
		return principalAfterInterest;
	}
}
