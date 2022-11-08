package com.string;

public class Concepts {
	
   public static void main(String[] args) {
	   
	   String s = "Welcome to Sathyam cinema";
	   String b = "Welcome to Sathyam Cinema";
	   String c = "";
	   char charAt = s.charAt(8);
	   System.out.println(charAt);
	   int length = s.length();
	   System.out.println(length);
	   boolean equals = s.equals(b);
	   System.out.println(equals);
	   boolean equalsIgnoreCase = s.equalsIgnoreCase(b);
	   System.out.println(equalsIgnoreCase);
	   boolean startsWith = s.startsWith("W");
	   System.out.println(startsWith);
	   System.out.println(s.endsWith("a"));
	   System.out.println(s.toUpperCase());
	   System.out.println(s.toLowerCase());
	   System.out.println(s.contains("t"));
	   System.out.println(s.indexOf('e'));
	   System.out.println(s.lastIndexOf('e'));
	   System.out.println(s.replace('S', 'J'));
	   System.out.println(s.substring(7));
	   System.out.println(s.isEmpty());
	   System.out.println(c.isEmpty());
	   //System.out.println(s.split(c, length))    //   doubt

}
}
