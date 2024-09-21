package com.evergent.corejava.multithreading;

class testimo1 implements Runnable {
	public void run() {
		System.out.println("Thread Created through Implement Interface");
	}
}

class raj extends testimo {
	public void run() {
		System.out.println("Second Thread is running");
	}
}

class testimo {

	public static void main(String args[]) {
		testimo1 t = new testimo1();
		Thread t1 = new Thread(t);
		t1.start();
		raj r=new raj();
		//Thread t2=new Thread(r);
		//t2.start();

	}
}
