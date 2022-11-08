package com.Return;

public class Return_Statement {
	
	private int chennai() {
		int sum;
		int a=10;
		int b=15;
		sum=a+b;
		return sum;

	}
	private float madurai(float g, float h) {
		
		float f= g*h;
		return f;
	}
	public static void main(String[] args) {
		Return_Statement b= new Return_Statement();
		
		float madurai = b.madurai(89.89f, 56.98f);
		System.out.println(madurai);
		int chennai = b.chennai();
		System.out.println(chennai);
		
	}

}
