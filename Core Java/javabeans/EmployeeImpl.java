package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		EmployeeBeans emp=new EmployeeBeans();
		emp.setEno(12);
		emp.setEname("Nihthish");
		emp.setEsal(55000.00);
		System.out.println("Id is"+emp.getEno());
		System.out.println("Name is"+emp.getEname());
		System.out.println("Salary: "+emp.getEsal());

	}

}
