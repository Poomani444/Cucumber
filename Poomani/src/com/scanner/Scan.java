package com.scanner;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Scan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nextLine = s.nextLine();
		System.out.println(nextLine);
		String next = s.next();
		System.out.println(next);
		int nextInt = s.nextInt();
		System.out.println(nextInt);
		float nextFloat = s.nextFloat();
		System.out.println(nextFloat);
		char charAt = s.next().charAt(0);
		System.out.println(charAt);
	}

}
