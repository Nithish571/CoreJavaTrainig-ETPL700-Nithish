package com.evergent.corejava.constructor;

public class Employee2 {
	int eno;
	String ename;
	double sal;

	Employee2() {
		System.out.print("Default Constructor ");
	}

	Employee2(int eno1, String ename1, double sal1) {
		eno = eno1;
		ename = ename1;
		sal = sal1;
	}

	void display() {
		System.out.println("Name \n " + ename + "\n Number " + eno + "\n Salary" + sal);
	}

	public static void main(String[] args) {
		new Employee2();
		Employee2 em2 = new Employee2(571, "Nithish", 75000);
		em2.display();
	}
}
