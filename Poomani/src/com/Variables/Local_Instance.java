package com.Variables;

public class Local_Instance {
	static int m=123;                    // Class variables or Instance variables
	char c;                       // Class variables no need to initialize just declare
	static String s="Legend";
	
	private void chennai() {  
		int i =10;                //Local variables must be initialize
		double j = 25.35;
		String k="best";
		System.out.println(i);
		System.out.println(j);
		System.out.println(m);
		System.out.println(k);
		System.out.println(c);
		

	}
	private void Uthiramerur() {
		byte g = 34;
		

	}
	public static void main(String[] args) {
		Local_Instance v = new Local_Instance();
		v.chennai();
		System.out.println(m);
	}

}
