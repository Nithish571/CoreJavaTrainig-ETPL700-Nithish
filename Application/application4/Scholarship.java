package com.evergent.javaoops.application4;

import java.util.*;

public class Scholarship {
	static int rankk ;

	public void famIncome() {
		final int income = 80000;
		System.out.println("Enter Your family Income");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter Your Score");
		rankk=sc.nextInt();
		if (n > income || rankk > 85) {
			System.out.println("Your Are Eligible for govt ScholarShip");
		} else {
			System.out.println("You Are Not Eligilble For govt. Scholarship ");
		}
	}

	/* public static void rank() {
		
		if (rankk < 10000) {
			System.out.println("Your Are Eligible for govt ScholarShip");
		} else {
			System.out.println("Your Are Not Eligible for govt ScholarShip");
		}*/

	}


