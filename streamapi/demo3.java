package com.evergent.corejava.streamapi;

import java.util.Arrays;
import java.util.List;

public class demo3 {

	public static void main(String[] args) {

		List<String> listInt = Arrays.asList("Hello", "Stream", "API");
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 4);

		listInt.stream().map(str -> str.length()).forEach(System.out::println);
		a.stream().map(i->i*i).forEach(System.out::println);
	}
}
