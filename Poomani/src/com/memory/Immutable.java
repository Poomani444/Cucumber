package com.memory;

public class Immutable {          
	//Immutable string or Literal String 
	
	public static void main(String[] args) {
		
		String a = "Chennai";
		String b = "Chennai";
		String c = a+b;         // concatenation==> A group things linked together
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
	}

}
