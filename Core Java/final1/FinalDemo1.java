package com.evergent.javaCore.final1;

public class FinalDemo1 {
	final String name="India";
	
	public void show()
	{
	//	name="PAKISTHAN";
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		
		FinalDemo1 fd=new FinalDemo1();
		fd.show();
	}

}
