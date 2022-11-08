package com.string;

public class Immutable {  //Literal string
	
	public static void main(String[] args) {
		System.out.println("===========Immutable String===========");

		String a = "Ponniyin";
		String b = "Ponniyin";  // Duplicate = Same memory
		String c = "selvan";
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));

		a = a+b;              // Concatenation = New memory
		System.out.println(a);
		System.out.println(System.identityHashCode(a));

		System.out.println("===========Mutable String===========");
		
		StringBuffer d = new StringBuffer("Ponniyin");
		StringBuffer e = new StringBuffer("Ponniyin");   // Duplicate = New memory
		StringBuffer f = new StringBuffer("Selvan");
		
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(e));
		System.out.println(System.identityHashCode(f));
		
		d.append(f);                                     // Concatenation = New memory
		System.out.println(d);
		System.out.println(System.identityHashCode(d));

	}

}
