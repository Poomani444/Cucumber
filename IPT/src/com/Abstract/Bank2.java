package com.Abstract;

public class Bank2 extends Bank1 {
	
	// extends keyword can access only one another class

	@Override
	public void PersonalLoan() {
		System.out.println("15%");

	}

	@Override
	public void homeLoan() {
		System.out.println("10%");
	}

	public static void main(String[] args) {
		Bank2 b = new Bank2();
		b.PersonalLoan();
		b.homeLoan();
		b.educationalLoan();

	}

}
