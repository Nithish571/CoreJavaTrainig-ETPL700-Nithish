package com.evergent.corejava.ExceptionalHandling;

public class ExceptionDemo6 {
	String name = "null";

	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println("I can Handle" + name.length());
		} catch (Exception e) {
			System.out.println(e);

		}
		finally {
			System.out.println("Finally Block For Closing Connections");
		}
	}
	public static void main(String args[]) {
		ExceptionDemo6 p = new ExceptionDemo6();
		p.myData();
	}

}
