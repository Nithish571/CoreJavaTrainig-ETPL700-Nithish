package com.evergent.corejava.multithreading;

class multithread extends Thread {

	public void run() {

		System.out.println("One" + getName());
		System.out.println(Thread.currentThread().getName());

		try {
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

class thread2 extends multithread {
	synchronized public void run() {
		System.out.println("Second Thread Running" + getName());
	}
}

public class multithread1 {

	public static void main(String[] args) {
		multithread m = new multithread();
		// m.setName("First Thread");
		m.start();
		//m.setName("Hello");
		//System.out.println(Thread.currentThread().getName());
		
		System.out.println(m.getName());
		// m.yield();
		thread2 m1 = new thread2();
		m1.start();
		// m.setName("Second Thread");
		// System.out.println(m1.isAlive());
		// System.out.println(m1.getName());

	}

}
