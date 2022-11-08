package com.polymorphism;

public class Overloading {
	//Overloading
	public void instagram () {
		System.out.println("Login Page");
	
	}
	public void instagram (String s, String s1) {
		System.out.println("Print Username:" +s);
		System.out.println("Print Password:" +s1);
	}
	public void instagram(long l) {
    	System.out.println("Print mobile Number" +l);
    	  }
    public static void main(String[] args) { 
    	Overloading p = new Overloading();
    	p.instagram();
    	p.instagram("poomani444@gmail.com","flower@123");
    	p.instagram(9444379403l);
    }
	
		
	}  

