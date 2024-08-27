package com.evergent.javaCore.static1;

public class StaticDemo1 {
	static String cname = "INDIA";

	static public void myData() {
		System.out.println("My Data");
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();
	}

}
