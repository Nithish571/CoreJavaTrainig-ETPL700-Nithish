package com.evergent.corejava.collections;
//import java.awt.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class CF6_ListIterator {

	public static void main(String[] args) {
	
		ArrayList l=new ArrayList();
		l.add("Ramu");
		l.add("Ravi");
		l.add("Bhanu");
		l.add("Nithish");
		
		ListIterator li=l.listIterator();	
		li.add("Welcome");
		
		while(li.hasNext())
		{
			String s=(String)li.next();
			System.out.println(s);
		//	if(s.equals("Balu");
		//	li.remove();
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
