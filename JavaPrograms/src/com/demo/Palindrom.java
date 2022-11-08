package com.demo;

public class Palindrom {
	
	public static void check() {
    int a = 12343;
    int b=a;
    int sum=0;
    
    while (a>0) {
    	int rem=a%10;
    	sum=(sum*10)+rem;
    	a=a/10;
    	
	}
		if (b==sum) {
			System.out.println("The given number "+b+" is Palindrom");
			} 
		else {
			System.out.println("The Given number "+b+" is Not Palindrom");
		}
		
	}
	public static void main(String[] args) {
		check();
	}

}
