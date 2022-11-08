package com.poly;

public class Facebook {

	public void fb() {
		System.out.println("Login Page");
	}
	public void fb(String a, String b) {
		System.out.println("Enter Username:"  +a);
		System.out.println("Enter Password:" +b);
	}
	public void fb(long c) {
		System.out.println("Enter your Mobile number:" +c);
	}
	public static void main(String[] args) {
		Facebook f = new Facebook();
		f.fb();
		f.fb("Monisha2203", "moni_34");
		f.fb(8220384198l);
	}
}

