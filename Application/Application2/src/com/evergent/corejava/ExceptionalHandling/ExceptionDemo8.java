package com.evergent.corejava.ExceptionalHandling;

public class ExceptionDemo8 {
	String name = "null";
    int k=0;
	public void myData() throws NullPointerException {
		System.out.println("ONE");
		System.out.println("I can Handle" + name.length());
	}
	public void myName() throws ArithmeticException 
	{
		int t=10/k;
		System.out.println(t);
	}

	
	public static void main(String args[]) {
		try {
			ExceptionDemo8 p = new ExceptionDemo8();
			p.myData();
			p.myName();
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
