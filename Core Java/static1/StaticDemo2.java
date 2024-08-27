package com.evergent.javaCore.static1;
//We can non static methods can access static meth and var
public class StaticDemo2 {
	static String cname = "INDIA";
	        String name="Nithish";

	static public void myData() {
		System.out.println("My Data");
	}
	public void show()
	{
		System.out.println("Its a Non Static Method");
	}

	public static void main(String[] args) {
		myData();
		System.out.println(cname);
		//System.out.println(StaticDemo2.cname);
		//StaticDemo2.myData();
		

	}

}
