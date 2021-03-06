package com.assignments.assignment5.models;

import java.util.Date;

public class SavingsAccount {

	long savingsAccountNumber;
	double balance;
	Date openedOn;
	double interestRate = 0.01;
	int id;
	static int nextSavingsAccountNumber = 1;
	
	public SavingsAccount() {
		this.balance = 0;
		this.openedOn = new Date(System.currentTimeMillis());
		this.interestRate = 0;
		this.savingsAccountNumber = nextSavingsAccountNumber++;
	}

	public long getAccountNumber() {
		return savingsAccountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.savingsAccountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getOpenedOn () {
		return openedOn;
	}

	public void setOpenedOn(Date openedOn) {
		this.openedOn = openedOn;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}