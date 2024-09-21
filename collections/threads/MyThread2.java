package com.evergent.corejava.collections.threads;
public class MyThread2 implements Runnable{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 myt=new MyThread2();
		Thread t1 = new Thread(myt);
		t1.start();
		Thread t2 = new Thread(myt);
		t2.start();
	}
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++)
		{
			System.out.println(i);
		}
		
	}

}
