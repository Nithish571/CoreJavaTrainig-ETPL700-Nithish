package com.evergent.corejava.ExceptionalHandling;

public class ExceptionDemo4 {
	String name = "null";
	int k = 0;
	int n = 10;

	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println("I can Handle");
			int t = 10 / k;
			System.out.println(t);
			//int n=sq;
			//System.out.println(n);

		} //catch (NullPointerException n) {
			//System.out.println(n);
	//	}
	catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		ExceptionDemo4 p = new ExceptionDemo4();
		p.myData();
	}

}
