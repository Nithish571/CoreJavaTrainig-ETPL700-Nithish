package com.evergent.corejava.strings;

public class splitDemo {

	public static void main(String[] args) {
		String str="Hello This is Mahendra jj Singh Dhoni";
		String str1[]=str.split(" ");
		for(String w:str1)
		{
			System.out.println(w);
		}
	}
}