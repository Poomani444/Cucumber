package com.polymorphism;

public class Over_Loading {

	public void Mobile() {
		System.out.println("Details of New Arrival:");

	}

	public void Mobile(String a, String b) {
		System.out.println("Mobile Name & Model:" +a+" "+b);
		
	}

	public void Mobile(int c) {
		System.out.println("Price: "+c);

	}
	public static void main(String[] args) {
		Over_Loading or = new Over_Loading();
		or.Mobile();
		or.Mobile("VIVO", "V2022");
		or.Mobile(20000);
	}

}
