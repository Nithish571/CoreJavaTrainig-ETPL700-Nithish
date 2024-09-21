package com.evergent.corejava.streamapi;

import java.util.*;

public class demo1 {
	public static void main(String[] args) {
		
	List<Integer> l=new ArrayList();//(1,2,3,4,5,5);
//	//	for(int i=0;i<6;i++)
//		{
//			System.out.println(l.get(i));
//		}
	l.add(1);
	l.add(23);
	l.add(62);
       l.stream().forEach(System.out::println);
	}
}
//List<Integer> listInt = Arrays.asList(1,2,3,4,5,6);
//
//for(int i=0;i<6;i++)
// System.out.println(listInt.get(i));
//
//
////Stream API with Method reference ::				  
//listInt.stream().forEach//(System.out::println);	