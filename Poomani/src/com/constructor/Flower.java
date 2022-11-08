package com.constructor;

public class Flower {

	public Flower() {
     System.out.println("Poomani");
	}

	public Flower(byte a) {
    System.out.println(a);
	}

	public Flower(short b) {
		System.out.println(b);

	}

	public Flower(int c) {
		System.out.println(c);

	}

	public Flower(long d) {
		System.out.println(d);

	}
	public Flower(float e) {
		System.out.println(e);
	}
	public static void main(String[] args) {
		Flower f = new Flower();
		Flower ff = new Flower(126);
		Flower gh = new Flower(88.8f);
		Flower hn = new Flower();
	}
}
