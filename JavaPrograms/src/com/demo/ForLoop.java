package com.demo;

public class ForLoop {
	public static void main(String[] args) {
		
		System.out.println("Type 1:");
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		System.out.println("Type 2:");
		for(int i=1; i<=5; i+=2) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}
	}

}
