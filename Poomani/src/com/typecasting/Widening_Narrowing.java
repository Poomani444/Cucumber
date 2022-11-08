package com.typecasting;

public class Widening_Narrowing {
	
	private void Narrow() {
		int a =123;
		// Datatype NewvariableName = (Datatype)Old VariableName;
		byte b= (byte)a;
		System.out.println("After Narrowing to Byte: "+b);
	}
	
	private void Widening() {
		int c = 9876;
		double d = (double)c;
		System.out.println("After Widening to Double: "+d);
	}
	
	
	public static void main(String[] args) {
		Widening_Narrowing wn = new Widening_Narrowing();
		wn.Narrow();
		wn.Widening();
		
	}

}
