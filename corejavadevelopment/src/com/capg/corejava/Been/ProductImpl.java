package com.capg.corejava.Been;

public class ProductImpl {
	public static void main(String[] args) {
		ProductBean bean = new ProductBean("Laptop", 500000, "Apple");

		System.out.println("Product name is :" + bean.getProduct());
		System.out.println("Product price is :" + bean.getPrice());
		System.out.println("Product Brand is :" + bean.getBrand());
	}
}
