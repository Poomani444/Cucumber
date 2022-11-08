package com.exercise;

public class Balaji { // constructor chaining

	public Balaji() {
		this(20000);
		System.out.println("Mobile selected");

	}

	public Balaji(int price) {
		this("VIVO");
		System.out.println("Price:" +price);

	}

	public Balaji(String name) {
		System.out.println("Model Name :" +name);

	}
	public static void main(String[] args) {
		Balaji b = new Balaji();
		
	}

}
