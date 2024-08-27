package coreJava_loops;

public class Loops3 {
	public static void main(String args[])
	{
	  String arr[][]=new String[5][5];
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println();
		  for(int j=0;j<arr.length;j++)
		  {
			  arr[i][j]="Java";
			  System.out.print(" "+arr[i][j]);
		  }
	  }
	  
	  
	  
	}

}
