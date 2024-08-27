package com.evergent.java.project;

import java.util.*;

public class CarrerGraspp {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("---- CHOOSE YOUR RIGHT CAREER PATH ----");
		System.out.print(
				" Dear Student :\n Enter 1 if Your Maths Student: \n Enter 2 if your Bi.p.c Student \n Enter 3 for exit:  ");
		do {
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Welcome to MPC DashBoard:");
				System.out.println(
						"Dear Student : Please enter 1 for Engineering : \n Enter 2 for Degree  \n Enter 3 for CA  ");

				int k;

				k = sc.nextInt();
				switch (k) {
				case 1:
					System.out.println("Welcome to Engineering ");
					int q;
					System.out.println(
							"1 for branches present in Engineering: \n 2 for Colleges \n 3 for Entrance exams for Engineering: ");
					q = sc.nextInt();
					switch (q) {
					case 1:
						System.out.println("These are the branches: \n CSE \n ECE \n EEE \n MEch \n Civil");
						break;
					case 2:
						System.out.println("These are the Colleges : \n BVRIT \n IIT-H \n JNTU \n OU \n CBIT");
						break;
					case 3:
						System.out.println(
								"These are the Entrance Exams: \n TS EAMCET \n JEE Mains \n JEE Adv \n AP EAMCET \n BITS");
						break;
					}
					break;

				case 2:
					System.out.println("Welcome to Degree ");
					break;

				case 3:
					System.out.println("Welcome to CA ");
					break;

				}
				break;

			case 2:
				System.out.println("Welcome to Bi.P.C DashBoard");
				System.out.println(
						"Dear Student : \n Please enter 1 for Medical : \n Enter 2 for MBBS  \n Enter 3 for CA  ");

				int m;

				m = sc.nextInt();
				switch (m) {
				case 1:
					System.out.println("Welcome to MBBS");
					int a;
					System.out.println(
							"1 for branches present in Medicine: \n 2 for Colleges \n 3 for Entrance exams for Engineering: ");
					a = sc.nextInt();
					switch (a) {
					case 1:
						System.out.println(
								"These are the branches: \n Forensic pathology \n Obstetrics and gynaecology \n Ophthalmology \n Anesthesiology \n Dermatology ");
						break;
					case 2:
						System.out.println("These are the Colleges : \n NIMS \n KIMS \n YASHODA \n OU \n CBIT");
						break;
					case 3:
						System.out.println("These are the Entrance Exams: \n NEET ");
						break;
					}
					break;

				case 2:
					System.out.println("Welcome to MBBS ");
					break;

				case 3:
					System.out.println("Welcome to CA");
					break;
				}
				break;
			}
		}

		while (n != 3);
	}
}
