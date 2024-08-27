package com.evergent.corejava.ExceptionalHandling;
class InsufficientFundException extends Exception
{
	InsufficientFundException(String message)
	{
	super(message);
	}
}

public class ExceptionDemo12 {
	static double balance =700.00;
	public static void checkBal(double amount) throws Exception
	{
	
		if(amount<balance)
			throw new InsufficientFundException("Insufficient Funds for Work:");
		else
			System.out.println("Sufficient Funds");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkBal(500.00);
		}
		catch(Exception e)
		{
			System.out.println("Caught Exception "+e.getMessage());
			System.out.print(e);
		}

	}

}
