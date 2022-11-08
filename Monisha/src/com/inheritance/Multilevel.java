package com.inheritance;

public class Multilevel extends Single_In {
	 
	public void people() {
		System.out.println("Human");
	}
    public static void main(String[] args) {
    	Multilevel m = new Multilevel();
    
    	m.vehicle();
    	m.people();
	}
}
