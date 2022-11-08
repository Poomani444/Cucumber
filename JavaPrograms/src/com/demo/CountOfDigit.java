package com.demo;

public class CountOfDigit {
	
	public static void count() {
		int a = 3456;
		int temp = a;
		int count = 0;

		while (a>0) {
			int rem = a%10;          //  6 5 4 3
			count++;         //  1 2 3 4

			a= a/10;          // 345 34 3 0.3

		}
		System.out.println("Count of the digit : "+temp+"="+count);


	}

	public static void main(String[] args) {
		count();
	}

}
