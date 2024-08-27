package com.evergent.corejava.oops;

public class MetodTypes {
	//No parameters with no return types
	public void show()
	{
	    System.out.println("No parameters with No Return Type ");
	}
	//parameters with no return type
	public void myData(int a,int b)
	{
		System.out.println(a+b);
	}
	//parameters with no return types
	public int MyMul(int d,int e)
	{
		return d*e;
	}
	public int myChance()
	{
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodTypes m=new MetodTypes();
		m.show();
		m.myData(11,22);
	//	m.MyMul();
		System.out.println(m.MyMul(5,5));
	//	m.myChance();
		System.out.println(m.myChance());
		
		

	}

}
