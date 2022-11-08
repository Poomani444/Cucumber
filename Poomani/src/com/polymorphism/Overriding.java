
package com.polymorphism;

public class Overriding extends Overloading {

	
	public void instagram() {
		System.out.println("Welcome to Instagram");
		
	}
	public static void main(String[] args) {
		Overriding p2 = new Overriding();
		p2.instagram();
		p2.instagram("poomani444@gmail.com", "flower*123");
		p2.instagram(9444379403l);
	}
	
}
