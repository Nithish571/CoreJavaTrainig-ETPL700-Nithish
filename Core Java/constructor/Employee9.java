package com.evergent.corejava.constructor;

public class Employee9 {
	String name;
	int age;
	public  Employee9(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public Employee9(Employee9 s)
	{
		this.name=s.name;
		this.age=s.age;
	}
	public void display()
	{
		System.out.println("Name is"+name);
		System.out.println("Age is "+age);
	}
	public static void main(String[] args) {
		Employee9 emp=new Employee9("Nithish",21);
		Employee9 emp1=new Employee9(emp);
		emp.display();
		emp1.display();
	}

}
