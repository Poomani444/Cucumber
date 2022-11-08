package com.poly;

public class Over_loading {
	
	public void mobile() {
		System.out.println("Redmi");

	}
	public void mobile(String a, int b, char c) {
		System.out.println(a+" " +b+" "+c);
	}
    public static void main(String[] args) {
    	Over_loading o = new Over_loading();
    	o.mobile();
    	o.mobile("Iphone", 14, '+');
    	}
}
