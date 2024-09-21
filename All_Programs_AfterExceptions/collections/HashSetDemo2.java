package com.evergent.corejava.collections;
import java.util.HashSet;
public class HashSetDemo2 {
// Contains Duplicates in ordered 
	public static void main(String[] args) {
		HashSet mySet=new HashSet();
		mySet.add(12);
		mySet.add("Nithish");
		mySet.add(123);
		mySet.add("12");
		mySet.add(true);
		System.out.println(mySet);
		

	}

}
