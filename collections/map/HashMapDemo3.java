package com.evergent.corejava.collections.map;
import java.util.*;
public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<String,String> capital=new HashMap<String , String>();
		capital.put("India","Delhi");
		capital.put("USA","Washington DC");
		capital.put("Germany", "Delhi");
		capital.put("AP",null);
		
		//to get only key values 
		
		for(String i:capital.keySet())
		{
			System.out.println(i);
		}
		
	}
	

}
