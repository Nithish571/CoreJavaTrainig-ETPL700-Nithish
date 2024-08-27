package com.evergent.corejava.abstract1;
public class ProductImp1 extends Product {
	public void show() {
		System.out.println("This is local method");
	}

	public void myProducts() {
		System.out.println("This is Products");
	}

	public static void main(String[] args) {
		ProductImp1 p1=new ProductImp1(); 
		Product p=new ProductImp1();  // We can't create obj to abstract class 
		//but we can create reference
	    //p.show();
		p.myProducts();
		p.allProducts();
	}

}
