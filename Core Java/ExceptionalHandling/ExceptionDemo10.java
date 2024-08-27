package com.evergent.corejava.ExceptionalHandling;

class AgeNotSupportException extends Exception {
	public AgeNotSupportException(int age) {
		System.out.println("The Age is less Than" + age);
		System.out.println("Your Illegal");
	}
}

public class ExceptionDemo10 {
	int a = 17;

	public void myAge() throws Exception {

		if (a < 18)
			throw new AgeNotSupportException(18);
		else
			System.out.println("Your Yes Legal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionDemo10 ed10 = new ExceptionDemo10();
			ed10.myAge();
		} catch (Exception e) {
			System.out.println("I can Handle Exception " + e);
		}
	}
}
