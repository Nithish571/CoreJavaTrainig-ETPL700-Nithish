package com.evergent.corejava.collections;
import java.util.*;
public class CF8_LinkedList {

	public static void main(String[] args) {
		LinkedList fruits=new LinkedList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		fruits.add("Orange");
		
		System.out.println("initial Fruits are :"+fruits);
		
		fruits.addFirst("Mango");
		System.out.println("After Adding "+fruits);
		
		fruits.addLast("StrawBerry");
		System.out.println(fruits);
		
		System.out.println(fruits.get(2));
		
		System.out.println(fruits.size());
		System.out.println(fruits);
		
		fruits.clear();
	}

}
