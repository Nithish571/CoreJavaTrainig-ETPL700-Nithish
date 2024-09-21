package com.evergent.corejava.collections.stack;
import java.util.*;
public class stackDemo3 {

	public static void main(String[] args) {
		Stack mys=new Stack();
		mys.push("Red");
		mys.push("Black");
		mys.push("White");
		//System.out.println(mys);
	    boolean b=mys.isEmpty();
	    System.out.println(b);
	    System.out.println(mys);
	    mys.clear();
	    boolean b1=mys.isEmpty();
	    System.out.println(b1);
		

	}

}
