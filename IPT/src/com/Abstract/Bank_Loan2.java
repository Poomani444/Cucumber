package com.Abstract;

public class Bank_Loan2 implements Bank_Loan1 {
	
	// implements keyword can access more than one interface

	@Override
	public void persionalLoan() {
		System.out.println("25%");
	}

	@Override
	public void homeLoan() {
		System.out.println("20%");
	}

	@Override
	public void educational() {
		System.out.println("10%");
	}

	public static void main(String[] args) {
		Bank_Loan2 bl = new Bank_Loan2();
		bl.persionalLoan();
		bl.homeLoan();
		bl.educational();
	}

}
