package com.demo;

public class ReverseTheNumbers {

	public static void reverse() {
		int a = 1234567;
		int temp = a;
		int sum = 0;

		while (a > 0) {
			int rem = a%10;
			sum = (sum * 10) + rem;
			a = a/10;

		}
		System.out.println("Reverse of Given numbers :" + temp + "=" + sum);
	}

	public static void main(String[] args) {
		reverse();
	}
}
