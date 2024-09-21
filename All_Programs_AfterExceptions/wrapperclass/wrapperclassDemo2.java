package com.evergent.javaCore.wrapperclass;

public class wrapperclassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i=new Integer(a);
		System.out.println(i); // Object Value Auto Boxing
		int a1=i.intValue();
		System.out.println(a1);// var val Unboxing
		
		float f=12.4f;
		Float f1=new Float(f);
		System.out.println(f1);
		float f11=f1.floatValue();
		System.out.println(f11);
		
		
		byte b=100;
		Byte b1=new Byte(b);
		System.out.println(b1);
		byte b11=b1.byteValue();
		System.out.println(b11);

	}

}
