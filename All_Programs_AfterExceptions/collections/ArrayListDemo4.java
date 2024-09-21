package com.evergent.corejava.collections;
import java.util.ArrayList;
import java.util.*;
public class ArrayListDemo4 {
// To Ittrive the Values 
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add("hel");
		a.add("llo");
		a.add(32.1);
		a.add(1);
		System.out.println(a);
		
		Iterator i=a.iterator();
		
		while(i.hasNext())
		{
			System.out.println("hi :"+i.next());
		}
		

	}

}
