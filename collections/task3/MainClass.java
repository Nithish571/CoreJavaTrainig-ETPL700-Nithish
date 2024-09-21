package com.evergent.corejava.collections.task3;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DequeClass k = new DequeClass();
		for (;;) {
			BeansClass b = new BeansClass();
			System.out.println("Welcome To Ticket Booking System");
			System.out.println("\n 1.FAdd Tickets \n 2.Process Ticket \n 3.View Ticket \n 4.Display All ");
			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("Enter Your id         :");
				int id = sc.nextInt();

				System.out.println("Enter your Name       :");
				String name = sc.next();

				System.out.println("Enter Number Of People:");
				int price = sc.nextInt();

				price = price * 100;
				b.setTid(id);
				b.setTname(name);
				b.setPrice(price);
				k.addTicket(b);
				break;
			case 2:
				k.processTicket();
				break;
			case 3:
				k.viewTicket();
				break;
			case 4:
				k.displayTicket();
			}
		}
	}

}
