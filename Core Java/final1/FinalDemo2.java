package com.evergent.javaCore.final1;

public class FinalDemo2 {
	final public void myProduct()
	{
		System.out.println("My Products");
	}
	public class Demo2 extends FinalDemo2
	{
		final String cname="India";
		public void myData()
		{
			System.out.println("This is My Data");
		}
	}

	public static void main(String[] args) {
		
		FinalDemo2 fd=new FinalDemo2();
		//7fd.myData();
		fd.myProduct();
		
	}

}
