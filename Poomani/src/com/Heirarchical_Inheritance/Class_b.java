package com.Heirarchical_Inheritance;

public class Class_b extends Class_a {

	public void bike () {
		System.out.println("bike");
	}
	
	public static void main(String[] args) {
		Class_b m = new Class_b();
		
		m.bike();
		m.land();
		m.gold();
		m.home();
		
	}
}
