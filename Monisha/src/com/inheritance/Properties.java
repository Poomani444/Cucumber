package com.inheritance;

public class Properties extends Single_In {
	
	public void building() {
		System.out.println("Flat");
	}
	public static void main(String[] args) {
		Properties p = new Properties();
		p.building();
		p.vehicle();
	}

}
