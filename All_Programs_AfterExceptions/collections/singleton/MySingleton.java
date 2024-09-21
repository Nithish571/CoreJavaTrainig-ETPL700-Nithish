package com.evergent.corejava.collections.singleton;

public class MySingleton {

	private static MySingleton singleton=null;
	
	private MySingleton()
	{
		
	}
	
	public static MySingleton getInstance()
	{
		if(singleton==null)
		
			singleton=new MySingleton(); 
		
		else
			//return singleton;
		return singleton;
		return singleton;
		
		
	}

}
