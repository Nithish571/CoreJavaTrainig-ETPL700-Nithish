package coreJAVA_Development;


import java.util.Scanner;

public class pattern {
	public static void main(String args[])
	{
		char c='A';
		for(int i=1;i<24;i++)
		{
			char start=(char)(c+i);
			char second=(char)(c+i+2);
			System.out.print(start+""+second+" ");
		}
	}
}
