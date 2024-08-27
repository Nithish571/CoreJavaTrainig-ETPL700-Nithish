package com.evergent.corejava.abstract1;

public class productImpl3 extends product3 {
	productImpl3()
	{
		System.out.println("product implementation 3");
	}
	public void show()
	{
		System.out.println("Local show method");
	}
	public void newProduct()
	{
	    System.out.println("My new product");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productImpl3 p=new productImpl3();
		p.show();
		p.newProduct();
		p.allProducts();
		

	}

}
