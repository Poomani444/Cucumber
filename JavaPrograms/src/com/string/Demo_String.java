package com.string;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Demo_String {

	public static String s = "software testing";

	public static void task1() { // Task1==> testing software

		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) { // length= 2
			System.out.print(s1[i] + " ");
		}
	}
	

	public static void task2() {// Tast2==> Testing Software
		System.out.println();

		String[] s2 = s.split(" ");
		for (int i = s2.length - 1; i>= 0; i--) {
			char c = s2[i].toUpperCase().charAt(0);
			System.out.print(c+s2[i] + " ");

		}
		System.out.println();
	}
	public static void task3() {  //count of vowels
		int count=0;
		for(int i=0;i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
					}
		System.out.println("count of vowesl : "+count);
		
		}
	public static void task4() {  // Tast2==> Remove the special Characters
		String ss= "*Flower&Fire*";
		System.out.println(ss);
		String ss1 = ss.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(ss1);
		
	}
	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4();

	}
}
