package com.evergent.corejava.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateDemo1 {

	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println(l);
		System.out.println(l.getDayOfMonth());
		System.out.println(l.getDayOfYear());
		System.out.println(l.getYear());
		System.out.println(l1.getHour());
		System.out.println(l1.getMinute());
		System.out.println(l1.getNano());
		
	}

}
