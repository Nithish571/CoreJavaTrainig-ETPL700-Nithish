package com.evergent.corejava.constructor;

class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("age: " + age);
	}
}

class Dog extends Animal {
	String breed;

	Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("breed: " + breed);
	}
}

public class Inheritance_Overriding {

	public static void main(String[] args) {

		Dog d = new Dog("buddy", 5, "Golden Retriever");
		d.displayInfo();

	}
}
