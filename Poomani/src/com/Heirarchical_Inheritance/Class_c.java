package com.Heirarchical_Inheritance;

public class Class_c extends Class_a {
	
	public void car () {
		System.out.println("car");
	}
	
    public static void main (String[] args) {
    	Class_c n = new Class_c();
    	
    	n.car();
    	n.land();
		n.gold();
		n.home();
				
    }
	
}
