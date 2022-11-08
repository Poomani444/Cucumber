   package com.constructor;

public class Chaining {

	public Chaining() {
		this(4567.345f);
		System.out.println("jeeboombaa");
	}

	public Chaining(int a) {
		this('s');
		System.out.println(a);
	}

	public Chaining(float b) {
		this(123);
		System.out.println(b);
	}

	public Chaining(char c) {
		this(1234555666666667l);
		System.out.println(c);

	}

	public Chaining(long d) {
		System.out.println(d);
	}
	public static void main(String[] args) {
		Chaining e = new Chaining();
	}
}