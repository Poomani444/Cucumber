package com.Control_statement;

import java.util.Scanner;

public class Switch_Case1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 1; i < 4; i++) {
			int nextInt = s.nextInt();
			switch (nextInt) {
			case 1:
				System.out.println("SRM");
				System.out.println("Available Sections:");
				
				for(char a='A'; a<'J'; a++) {
					if (a <'D') {
						System.out.println(a);
					}
				}
				break;
			case 2:
				System.out.println("SSN");
				int m=15;
				if (m<20 && m<30) {   // && -Both condition must be satisfied
				System.out.println("Raging free Environment");	
				}
				break;
			case 3:
				System.out.println("VIT");
				float n=88.8f;
				if (n<100.88 || n>177.77 ) { // ||-Either any one condition should be satisfied
					System.out.println("Pollution  free Campus");
				}
				break;
			default:
				System.out.println("No College Available");
				break;
			}
		}

	}

}
