package com.evergent.corejava.ExceptionalHandling;
// If one exception occurs then next code lines will nit be executed
public class ExceptionDemo2 {
	String name = null;
	int k=0;

	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println("I can Handle" + name.length());
			int t=10/k;
			System.out.println(t);
		} catch (NullPointerException e) {
			System.out.println(e);

		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
		ExceptionDemo2 p = new ExceptionDemo2();
		p.myData();
	}

}
