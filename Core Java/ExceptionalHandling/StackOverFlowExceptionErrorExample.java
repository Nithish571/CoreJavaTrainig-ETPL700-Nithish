package com.evergent.corejava.ExceptionalHandling;

public class StackOverFlowExceptionErrorExample {

	public static void main(String[] args) {
	 try {
	     recursiveMethod();
		 
	 }
	 catch(Exception e)
	 {
		 System.out.println("Stack Over Flow Caught"+e.getMessage());
	 }
	}

	public static void recursiveMethod() {
		recursiveMethod();
	}

}
