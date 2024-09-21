package com.evergent.corejava.objectClassMethods;
public class personDemo {
	String name;
	int age;
	
	public personDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return name+age;
	}
}