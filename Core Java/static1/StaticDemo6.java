package com.evergent.javaCore.static1;

public class StaticDemo6 {
	static String name = "Nithish";
	int age = 21;
	String address = "Medak";

	public void display() {
		name = "Welcome";
		System.out.println("Name :" + name);
		System.out.println("Age is :" + age);
		System.out.println("Address:" + address);
	}

	public static void main(String[] args) {
		StaticDemo6 std6 = new StaticDemo6();
		System.out.println(std6.name);
		std6.display();
		StaticDemo6 std66 = new StaticDemo6();
		System.out.println(std66.name);
	}
}
