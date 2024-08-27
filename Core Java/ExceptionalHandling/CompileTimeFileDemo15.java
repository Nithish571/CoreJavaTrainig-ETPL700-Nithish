package com.evergent.corejava.ExceptionalHandling;
import java.io.*;
import java.util.*;
public class CompileTimeFileDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("C:/myFolder/Jello.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
