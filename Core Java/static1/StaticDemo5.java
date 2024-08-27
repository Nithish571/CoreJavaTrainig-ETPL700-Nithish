package com.evergent.javaCore.static1;
// Non Static methods can access static var and methods
public class StaticDemo5 {
	static String cname = "INDIA";
	        String name="Nithish";

	static public void myData() {
		System.out.println("My Data");
	}
	public void show()
	{
		myData();
		System.out.println("Its a Non Static Method "+cname);
	}

	public static void main(String[] args) {
		
		StaticDemo5 s=new StaticDemo5();
		s.show();
		s.myData();

	}

}
