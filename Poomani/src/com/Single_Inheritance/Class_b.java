package com.Single_Inheritance;

public class Class_b extends Class_a {

	public void home() {
		System.out.println("home");
	}
	public static void main(String[] args) {
		Class_b ref = new Class_b();
		
		ref.bike();
		ref.car();
		ref.home();
	}
}
