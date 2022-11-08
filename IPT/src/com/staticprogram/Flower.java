package com.staticprogram;

public class Flower {
	
	static int i = 10;
	static  {
		System.out.println("Static block");   //static block will executed first
	}
	 
	public static void bell() {
		System.out.println("Good boy");

	}
	public static void main(String[] args) {
		bell();
		System.out.println(i);
	}

}
