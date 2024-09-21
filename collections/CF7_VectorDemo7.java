package com.evergent.corejava.collections;
import java.util.*;
public class CF7_VectorDemo7 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add("Hello");
		v.add(123.23);
		System.out.println(v);
		
		Enumeration hh = v.elements();
		while(hh.hasMoreElements())
		{
			System.out.println(hh.nextElement());
		}
		
	}
}
