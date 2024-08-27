package com.evergent.corejava.ExceptionalHandling;

public class ExceptionDemo11 {
	String name = "null";

	public void myData() throws NullPointerException {
		System.out.println("ONE");
		System.out.println("I can Handle" + name.length());
	}

	
	public static void main(String args[]) {
		try {
			ExceptionDemo11 p = new ExceptionDemo11();
			p.myData();
		//	p.myName();
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
