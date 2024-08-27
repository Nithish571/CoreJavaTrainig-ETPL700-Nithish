package com.evergent.core_java.Arrays;

public class ArraysDemo5 {
public static void main(String args[])
{
	int arr[][]=new int[5][5];
	for(int i=0;i<5;i++)
	{
		System.out.println();
		for(int j=0;j<5;j++)
		{
			if(i==j)
			{
				arr[i][j]=7;
			System.out.print(arr[i][j]);
			}
			else
			{
				arr[i][j]=0;
				System.out.print(arr[i][j]);
			}
			
		}
	}
  }
}
