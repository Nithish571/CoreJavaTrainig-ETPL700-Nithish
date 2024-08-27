package com.evergent.corejava.ExceptionalHandling;

public class ExceptionDemo3 {
	String name = "null";

	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println("I can Handle" + name.length());
		} catch (Exception e) {
			System.out.println(e);

		}
	}
	public static void main(String args[]) {
		ExceptionDemo3 p = new ExceptionDemo3();
		p.myData();
	}

}
