package com.Bank.entities;

import java.util.Scanner;

public class BankAccount {
	static Scanner input = new Scanner(System.in);
	String name, actype;
	int accNo, bal, amt;

	public BankAccount(String name, int accNo, String actype, int bal) {
		this.name = name;
		this.accNo = accNo;
		this.actype = actype;
		this.bal = bal;
	}

	
}
