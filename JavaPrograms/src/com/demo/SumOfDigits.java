package com.demo;

public class SumOfDigits {

	public static void main(String[] args) {
		int a = 123456;
		int temp = a;
		int sum = 0;

		while (a > 1) {
			int rem = a % 10;
			sum = sum + rem;
			a = a /10;

		}
		System.out.println("Sum of given number :" + temp + "= " + sum);
	}
}
