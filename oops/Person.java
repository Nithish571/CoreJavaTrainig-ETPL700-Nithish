package com.evergent.corejava.oops;

public class Person {
	String name="Nithish Nayak";
	int age=21;
	String address="Medak";
	
	public void display()
	{
		System.out.println("Name is    :"+name);
		System.out.println("Age is     :"+age);
		System.out.println("Address is :"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.display();

	}

}