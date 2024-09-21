package com.evergent.corejava.collections.threads;
import java.lang.Thread;
public class Mythread1  extends Thread{
	public void run() //throws
	{
		for(int i=1;i<100;i++)
		{
			System.out.println(i);
		}
	}


	public static void main(String[] args) //throws {
	{
		Mythread1 t=new Mythread1();
		t.run();
		
		Mythread1 t1=new Mythread1();
		t1.run();
		
		
		
	}

}

