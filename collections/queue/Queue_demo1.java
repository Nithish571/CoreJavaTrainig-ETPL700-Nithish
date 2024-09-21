package com.evergent.corejava.collections.queue;
import java.util.*;
public class Queue_demo1 {

	public static void main(String[] args) {
		Queue <Integer> q=new PriorityQueue<>();
		q.add(8);
		q.add(203);
		q.add(3);
		q.add(234);
		System.out.println(q);

	}

}
