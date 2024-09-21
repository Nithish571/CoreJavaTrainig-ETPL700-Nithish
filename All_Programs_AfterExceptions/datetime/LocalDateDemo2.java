package com.evergent.corejava.datetime;

import java.time.LocalDate;
public class LocalDateDemo2 {

	public static void main(String[] args) {
		LocalDate l=LocalDate.now();
		System.out.println(l);
		System.out.println(l.getDayOfMonth());
		System.out.println(l.getDayOfYear());
		System.out.println(l.getYear());

	}

}
