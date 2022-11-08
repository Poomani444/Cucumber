package com.control_statement;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner d = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			int nextInt = d.nextInt();
			System.out.println("Course Available in PEC:");
			
			switch (nextInt) {
			case 1:
				System.out.println("EEE");

				break;
			case 2:
				System.out.println("ECE");
				break;
			case 3:
				System.out.println("Mech");
				break;
			case 4:
				System.out.println("Civil");
				break;

			default:
				System.out.println("No Course Available");
				break;
			}
		}
	}

}
