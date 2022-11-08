package com.staticprogram;

import javax.security.auth.Subject;

public class Demo1 {
	 static int i = 20;
	 
	 public void sub() {
System.out.println("Demo1");
	}

	 public static void main(String[] args) {
		Demo1 d = new Demo1();
		Demo.add();
		System.out.println(Demo.i);
		System.out.println(Demo1.i);
		d.sub();
		
	}
}
