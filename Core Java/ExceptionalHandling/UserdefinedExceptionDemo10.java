package com.evergent.corejava.ExceptionalHandling;
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
public class UserdefinedExceptionDemo10 {
	int age=21;
	public static void checkAge(int age) throws Exception
	{ 
	if(age<18)
		throw new InvalidAgeException("Age must be 18 or older");
	else
		System.out.println("Access Granted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(17);
		}
		catch (Exception e)
		{
			System.out.println("Caught Exception "+e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("Program Continues After Handling the Exceptions");

	}

}
