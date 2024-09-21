package com.evergent.corejava.collections.queue;
import java.util.*;
public class Queue_demo3 {

	public static void main(String[] args) {
		Queue <Integer> q=new PriorityQueue<>();
		q.add(8);
		q.add(203);
		q.add(3);
		q.add(234);
		System.out.println(q.poll());
		System.out.println(q);
		q.clear();
		try{
			System.out.println(q.remove());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
