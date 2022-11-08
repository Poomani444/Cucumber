package com.Multilevel_Inheritance;

public class Class_c extends Class_b {

	public void instagram() {
		System.out.println("instagram");
	}
	public static void main(String[] args) {
		Class_c App = new Class_c();
		App.facebook();
		App.whatsapp();
		App.instagram();
	}
}
