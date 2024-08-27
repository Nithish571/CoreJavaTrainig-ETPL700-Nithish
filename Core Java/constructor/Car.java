package com.evergent.corejava.constructor;

public class Car {
	String Color;
	int maxSpeed;
	Car()
	{
		Color="White";
		maxSpeed=120;
	}
	Car(String Color , int maxSpeed)
	{
		this.Color=Color;
		this.maxSpeed=maxSpeed;
	}
	void display()
	{
		System.out.println("Color is "+Color);
		System.out.println("Max Speed "+maxSpeed);
	}

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car("Red",150);
		c1.display();
		c2.display();
	}

}
