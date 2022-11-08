package com.memory;

public class mutable {
	//Mutable String or Non-literal String
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Flower");
		StringBuffer b = new StringBuffer("Flower");
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		a.append(b); // concatenation
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		StringBuilder c = new StringBuilder("Fire");
		StringBuilder d = new StringBuilder("Fire");
		
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		c.append(d);
		System.out.println(c);
		System.out.println(System.identityHashCode(c));
		
		
	}

}
