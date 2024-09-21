package com.evergent.corejava.collections;

import java.util.*;

public class TreeSetDemo5 {
//Prints directly in Sorted Order
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(123);
		t.add(987);
		t.add(334);
		t.add(3);
		System.out.println(t);
	}
}