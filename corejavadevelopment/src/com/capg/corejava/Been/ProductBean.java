package com.capg.corejava.Been;

public class ProductBean {
	private String product;
	private  int price ;
	private String brand;
	
	
	public ProductBean(String product, int price, String brand) {
		super();
		this.product = product;
		this.price = price;
		this.brand = brand;
	}


	public String getProduct() {
		return product;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}
	
}
