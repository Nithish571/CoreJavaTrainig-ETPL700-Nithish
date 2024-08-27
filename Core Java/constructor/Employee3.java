package com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;

	Employee3() {
		System.out.print("Default Constructor ");
	}

	Employee3(int eno, String ename, double sal) {
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}

	void display() {
		System.out.println("Name \n " + ename + "\n Number " + eno + "\n Salary" + sal);
	}

	public static void main(String[] args) {
		new Employee3();
		Employee3 em2 = new Employee3(571, "Nithish", 75000);
		em2.display();

	}

}
