package com.capg.corejava.abstract1;

abstract class product2 {
	public abstract void newproduct();

	public void allproducts() {
		System.out.println("Laptop");
		System.out.println("Desktop");
	}
}

public class ProductImpl2 extends product2 {

	@Override
	public void newproduct() {
		System.out.println("Mac laptop ");
		System.out.println("Rs 200000");
		System.out.println("2016 pro ");
	}

	public void display() {
		System.out.println("local Method ");
	}

	public static void main(String[] args) {
		product2 impl=new ProductImpl2();
		impl.allproducts();
		impl.newproduct();
		//impl.display();      //Error The method display() is undefined for the type product2
	}

}


//O/P
//Laptop
//Desktop
//Mac laptop 
//Rs 200000
//2016 pro 
 
