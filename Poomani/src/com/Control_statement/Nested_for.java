package com.Control_statement;

public class Nested_for {

	public static void main(String[] args) {
		for(int i=0; i<=2; i++) {        // Outer Loop
			for(int j=3; j<5; j++) {     // Inner Loop
				System.out.println(i+"  "+j);
			}
		}
	}
}
