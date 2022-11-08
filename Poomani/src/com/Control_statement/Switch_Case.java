package com.Control_statement;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);

		for (int a = 1; a < 4; a++) {
			int nextInt = m.nextInt();
			System.out.println("Available College Name:");
			switch (nextInt) {
			case 1:
				System.out.println("Prathyusha");
				
				break;

			case 2:
				System.out.println("Panimalar");
				break;

			case 3:
				System.out.println("Venkateshwara");
				break;

			case 4:
				System.out.println("Sathyabama");
				break;

			default:
				System.out.println("No college avaialable");
				break;
			}
		}
		for (char b = 'A'; b < 'D'; b++) {
			char charAt = m.next().charAt(b);
			System.out.println("Availble Section:");
			switch (charAt) {
			case 'A':
				System.out.println("A-Section");

				break;
			case 'B':
				System.out.println("B-Section");

				break;
			case 'C':
				System.out.println("C-Section");

				break;

			default:
				System.out.println("All sections are closed");
				break;
			}
		}
	}

}
