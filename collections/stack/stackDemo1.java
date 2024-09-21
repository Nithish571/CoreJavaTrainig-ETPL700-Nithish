package com.evergent.corejava.collections.stack;
import java.util.*;
public class stackDemo1 {

	public static void main(String[] args) {
		Stack mys=new Stack();
		mys.push("Red");
		mys.push("Black");
		mys.push("White");
		System.out.println(mys);
		System.out.println(mys.pop());
		System.out.println(mys.pop());
		System.out.println(mys.pop());

	}

}
