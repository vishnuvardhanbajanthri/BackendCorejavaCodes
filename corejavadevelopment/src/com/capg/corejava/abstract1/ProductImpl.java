package com.capg.corejava.abstract1;

abstract class product {
	public abstract void newproduct();

	public void allproducts() {
		System.out.println("Laptop");
		System.out.println("Desktop");
	}
}

public class ProductImpl extends product {

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
		ProductImpl impl = new ProductImpl();
		impl.allproducts();
		impl.newproduct();
		impl.display();
	}

}


//O/P
//Laptop
//Desktop
//Mac laptop 
//Rs 200000
//2016 pro 
//local Method 
