package com.Abstract;

public class Bala {
	public Bala() {
		this(5000);
		System.out.println("Stock available in showrooms");

	}

	public Bala(String a) {
		
		System.out.println("Mobilr Name :"+ a);

	}

	public Bala(int b) {
		this("Apple");
		System.out.println("Mobile Price :" + b);

	}
	public static void main(String[] args) {
		Bala b = new Bala();
	}
}

	