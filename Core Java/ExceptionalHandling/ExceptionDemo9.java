package com.evergent.corejava.ExceptionalHandling;
class ProductNotFoundException extends Exception{
	
	public  ProductNotFoundException(String message)
	{
		System.out.println("Message "+message);
	}
	
}
public class ExceptionDemo9 
{
	int pno=105;
	public void myData() throws Exception{
		if(pno>100) 
			throw new ProductNotFoundException("Produt is Not There");
		else
			System.out.println("Product Is There");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ExceptionDemo9 ed1=new ExceptionDemo9();
		ed1.myData();
			
		}
		catch(Exception e)
		{
			System.out.println("I Can Handle Message :"+e);
		}

	}

}