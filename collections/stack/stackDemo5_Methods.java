package com.evergent.corejava.collections.stack;
import java.util.*;
public class stackDemo5_Methods {

	public static void main(String[] args) {
		Stack<String> mys=new Stack();
		mys.push("Apple");
		mys.push("Banana");
		mys.push("Cherry");
		mys.push("Date");
		
		System.out.println(mys);
		
		String topElement=mys.pop();
		System.out.println(topElement);
		
		String removedElement=mys.pop();
		System.out.println("Removed Element"+removedElement);
		
		System.out.println("Stack After Pop"+mys);
		System.out.println("---------");
		
		boolean isEmpty=mys.isEmpty();
		System.out.println(isEmpty);
		
		int position =mys.search("Apple");
		if(position!=-1)
		{
			System.out.println("Banana Is  in Stack");
		}
		else
		{
			System.out.println("Not in Stack");
		}
		mys.clear();
		//System.out.println(clear);
		
		
		
		

	}

}
