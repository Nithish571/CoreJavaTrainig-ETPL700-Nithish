package com.evergent.corejava.ExceptionalHandling;
// try Associated with finally
public class ExceptionDemo5 {
	String name = "null";

	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println("I can Handle" + name.length());
		}
		finally {
			System.out.println("Finally Block For Closing Connections");
		}
	}
	public static void main(String args[]) {
		ExceptionDemo5 p = new ExceptionDemo5();
		p.myData();
	}

}
