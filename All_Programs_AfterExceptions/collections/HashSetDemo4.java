package com.evergent.corejava.collections;
import java.util.*;
public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(1);
		h.add("hel");
		h.add("llo");
		h.add(32.1);
		h.add(1);
		System.out.println(h);
		
		Iterator i=h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	/*	for(int k=0;k<5;k++)
		{
		System.out.println(h[k]);	
		}
*/
	}

}
