package com.polymorphism;

public class Flipkart extends Over_Loading {
	
	@Override
	public void Mobile() {
		
		super.Mobile();
	}
	@Override
	public void Mobile(String a, String b) {
		
		super.Mobile(a, b);
	}
	@Override
	public void Mobile(int c) {
		
		super.Mobile(c);
	}
	public static void main(String[] args) {
		Flipkart ft = new Flipkart();
		ft.Mobile();
		ft.Mobile("Oneplus7", "Nord");
		ft.Mobile(25000);
	}
	

}
