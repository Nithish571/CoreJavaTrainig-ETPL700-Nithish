package com.evergent.corejava.ExceptionalHandling;

public class ExceptionDemo7 {
	String name = "null";

	public void myData() throws NullPointerException {
		System.out.println("ONE");
		System.out.println("I can Handle" + name.length());
	}

	
	public static void main(String args[]) {
		try {
			ExceptionDemo7 p = new ExceptionDemo7();
			p.myData();
			// p.myName();
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
