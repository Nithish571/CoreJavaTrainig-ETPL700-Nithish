package com.evergent.corejava.collections.task3;

import java.util.*;

public class DequeClass {
	ArrayDeque<BeansClass> ad = new ArrayDeque<BeansClass>();

	public void addTicket(BeansClass b) {
		ad.add(b);
		System.out.println("SucessFully Added:");
	}

	public void processTicket() {
		if (ad.size() > 0) {
			System.out.println(ad.pollLast());
		} else {
			System.err.println("Not Available");
		}
	}

	public void viewTicket() {
		if (ad.size() > 0) {
			System.err.println(ad.peekLast());
		} else {
			System.out.println("No Ticket Available");
		}
	}

	public void displayTicket() {
		if (ad.size() > 0) {
			for (BeansClass b : ad) {
				System.out.println("Ticket :" + b.getTid() + "\nCustomer Name: " + b.getTname() + "\nTicket Price: "
						+ b.getPrice());
			}
		} else {
			System.out.println("Ticket Not avilable");
		}
	}
}
