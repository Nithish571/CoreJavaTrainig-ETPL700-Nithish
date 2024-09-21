package com.evergent.corejava.collections.queue;

import java.util.*;

public class QueueDemo16 {

	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<>();
		d.add(1223);
		d.add(1224);
		d.add(1225);
		d.add(1226);
		d.add(1227);
		System.out.println(d);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Be Deleted");
		int num = sc.nextInt();

		boolean remove = d.remove(num);
		if (remove) {
			System.out.println("Removed element is " + num);
		}

		else {
			System.out.println("Element Is Not Found " + num);
		}
		System.out.println("ArrayDeque after removal: " + d);
	}
}
