package com.evergent.javaCore.wrapperclass;
import java.util.*;
public class wrapperClassDemo4 {

	public static void main(String[] args) {
		
		int a=100;
		Integer i1=new Integer(a);
		ArrayList myList=new ArrayList();
		myList.add(i1);
		System.out.println(myList);
		
		Integer i2=new Integer(200);
		myList.add(i2);
		System.out.println(myList);
		
		myList.add(new Integer(45));
		System.out.println(myList);
		
		System.out.println(myList.get(1));
		
		
	}

}
