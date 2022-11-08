package com.fullyabstration;

public class Owner implements Bikes, Cars {

	@Override
	public void maruthi() {
System.out.println("Price=10L");
		
	}

	@Override
	public void tata() {
		System.out.println("Price=20L");
		
	}

	@Override
	public void pulser() {
		System.out.println("Price=1.5L");
		
	}

	@Override
	public void rx() {
		System.out.println("Price=2L");
		
	}
	public static void main(String[] args) {
		Owner o = new Owner();
		o.maruthi();
		o.tata();
		o.pulser();
		o.rx();
	}

}
