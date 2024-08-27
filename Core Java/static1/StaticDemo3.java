package com.evergent.javaCore.static1;

public class StaticDemo3 {
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
		// show();// we cannot acess nonn static methods
		// System.out.println(name);// we cannot acess static var
		//System.out.println(StaticDemo2.cname);
		//StaticDemo2.myData();
		

	}

}
