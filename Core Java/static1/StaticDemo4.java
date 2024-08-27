package com.evergent.javaCore.static1;

public class StaticDemo4 {
	static String cname = "INDIA";
	        static String name="Nithish";

	static {
		int a=10,b=20,c;
		System.out.println("First executing static block");
		c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
	    System.out.println("cname "+cname);
	   // System.out.println(staticDemo4.name);
	    
	}

}
