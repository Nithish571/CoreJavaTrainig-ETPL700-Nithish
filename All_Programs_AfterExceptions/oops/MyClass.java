package com.evergent.corejava.oops;
public class MyClass  extends Calculation{
	public void show()
	{
		System.out.println("Local Variable");
	}
	public static void main(String[] args) {
		MyClass m=new MyClass();
		m.show();
		m.add();
		m.sub();
	}
}