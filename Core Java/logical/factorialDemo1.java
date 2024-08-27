package com.evergent.core_java.logical;

public class factorialDemo1 {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		System.out.print(n1);
		for(int i=2;i<10;i++)
		{
			int n3=n1+n2;
			
			n2=n1;
			n1=n3;
			System.out.print(" "+n3);
		}
		
	}

}
