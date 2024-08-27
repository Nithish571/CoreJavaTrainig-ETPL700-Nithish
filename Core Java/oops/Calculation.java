package com.evergent.corejava.oops;

public class Calculation {
	int a = 10;
	int b = 20;
	int c;

	public void add() {
		c = a + b;
		System.out.println("Addition is:" + c);
	}

	public void mut() {
		System.out.println("Multiplication is:" + (a * b));
	}

	public void sub() {
		System.out.println("Substraction is :" + (a - b));
	}

	public void div() {
		System.out.println("Division is: " + (a / b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cc = new Calculation();
		cc.add();
		cc.sub();
		cc.div();
		cc.mut();

	}

}
