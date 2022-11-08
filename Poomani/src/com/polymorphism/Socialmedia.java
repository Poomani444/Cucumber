package com.polymorphism;

public class Socialmedia {
	//Overloading
	public void facebook() {
		System.out.println("Login Page");
	}
    
	public void facebook(String s, String b) {
		System.out.println("Enter UserName:" +s);
		System.out.println("Enter Password:" +b);
	}
	public void facebook(Long m) {
		System.out.println("Eneter Your Mobile Number:" +m);
	}
    public static void main(String[] args) {
		Socialmedia sc = new Socialmedia();
		sc.facebook();
		sc.facebook("Poomani", "flower.444");
		sc.facebook(9444379403L);
	}
}
