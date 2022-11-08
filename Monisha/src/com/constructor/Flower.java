package com.constructor;

public class Flower {
	public Flower() {
		System.out.println("Moni");

	}

	public Flower(int a) {
		System.out.println(a);

	}

	public Flower(double b) {
		System.out.println(b);

	}

	public Flower(long c) {
		System.out.println(c);

	}

	public Flower(char d, char e) {
		System.out.println(d+" "+e);

	}
	public static void main(String[] args) {
		Flower f = new Flower();
		Flower ff = new Flower('a','b');
		Flower ft = new Flower(167.7686);
		Flower gv = new Flower(456789345678l);
		Flower bb = new Flower(1234);
		Flower bh = new Flower(456789l);
	}

}
