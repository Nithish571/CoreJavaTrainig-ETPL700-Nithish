package com.evergent.corejava.constructor;

class MyEmployee {
	int eno;

	public MyEmployee() {

	}

	MyEmployee(int eno) {
		System.out.println("Employee number" + eno);
	}

	public class Employee4 extends MyEmployee {
		String ename;
		double sal;

		public  Employee4() {
			System.out.println("Default");
		}

		public  Employee4(int eno, String ename, double sal) {
			super(eno);
			this.ename = ename;
			this.sal = sal;
		}
		public void display()
		{
			System.out.println(ename+" "+sal);
		}

		public static void main(String args[]) {
			Employee4 emp4=new Employee4(1,"Rakesh",50000);
			emp4.display();
			
			
		
		}
	}
}
