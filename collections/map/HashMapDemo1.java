package com.evergent.corejava.collections.map;
import java.util.HashMap;
public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h=new HashMap();
		h.put(571,"Nithish");
		h.put(572,"Vikram");
		h.put(573, "Kavya");
		h.put(null, "narasimha"); // Only Takes one Duplicate Key so only one nnill
		h.put(null, "Vighnes");
		h.put(123,null);
		h.put(420, null);
		System.out.println(h);
		

	}

}
