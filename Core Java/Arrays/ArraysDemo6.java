package com.evergent.core_java.Arrays;

public class ArraysDemo6 {
public static void main(String args[])
{
	int arr[][]=new int[5][5];
	for(int i=0;i<5;i++)
	{
		System.out.println();
		for(int j=0;j<5;j++)
		{
			arr[i][j]=7;
			System.out.print(arr[i][j]);
			
		}
	}
}
}
