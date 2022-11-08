package com.demo;

public class Armstrong {

	public static void check() {
		int a = 153;
		int temp = a;
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			sum = sum + (rem * rem * rem);  // sum = 0+(3*3*3)=27 => 27+(5*5*5)=142 => 142=(1*1*1)=153
			a = a / 10;
		}

		if (temp == sum) {
			System.out.println("Given Number " + temp + "Is Armstrong");

		} else {
			System.out.println("Given Number " + temp + " IS NOt Armstrong");
		}

	}

	public static void main(String[] args) {
		check();

	}
}
