package com.evergent.corejava.strings;

public class StringDemo_Methods {
	public static void main(String[] args) {
		String name=new String("      Hello World");
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.endsWith("a"));
		//String str="Mahesh";
		StringBuffer str=new StringBuffer("Mahesh");
		str.append(" Babu");
		System.out.println(str);
		str.insert(7, "Hero ");
		System.out.println(str);
		str.replace(7,11,"");
		System.out.println(str);
		System.out.println(str.reverse());
		System.out.println(str.reverse());
		System.out.println("Capacity "+str.capacity());
		System.out.println("Length "+str.length());
		
		 	}
}
