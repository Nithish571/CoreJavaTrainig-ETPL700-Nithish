package com.evergent.corejava.streamapi;

import java.util.*;
public class demo2 {

	public static void main(String args[])
	{
		/* ArrayList s=new ArrayList();
		s.add(818);
		s.add(1);
		s.add(889);
		s.add(889);
		s.add(8);
		s.add(1); */
		
		List a= Arrays.asList(1,2,3,4,4);
		
		
		//s.stream().forEach(System.out::println);
		System.out.println("Distinct");
	    //s.stream().distinct().forEach(System.out::println);
	    System.out.println("Limit 3");
		//s.stream().limit(3).forEach(System.out::println);
		
		System.out.println("Skip");
		
		//s.stream().skip(2).forEach(System.out::println);
		
		//a.stream().map(i->i*i).forEach(System.out::println);
		//s.stream().map(i->i*i).forEach(System.out::println);
		
		
				
	}
}
