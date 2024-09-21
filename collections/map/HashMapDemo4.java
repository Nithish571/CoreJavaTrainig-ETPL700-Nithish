package com.evergent.corejava.collections.map;

import java.util.*;

public class HashMapDemo4 {

	public static void main(String[] args) {
		HashMap<Integer, String> studentRecords = new HashMap<Integer, String>();
		studentRecords.put(101, "Raj");
		studentRecords.put(106, "Washington DC");
		studentRecords.put(100, "Delhi");
		studentRecords.put(980, null);

		// to get only key values
		// System.out.println(studentRecords);

		for (Integer i : studentRecords.keySet()) {
			System.out.println(i);

		}
		// System.out.println("\n");

		for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
			System.out.println("ID :" + entry.getKey() + " :Name :" + entry.getValue());
		}

	}

}
