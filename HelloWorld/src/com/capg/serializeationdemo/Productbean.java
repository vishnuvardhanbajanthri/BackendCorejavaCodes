package com.capg.serializeationdemo;

public class Productbean {
	private String name;
	private int price;
	private String brand;
	
	public Productbean(String name, int price, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Productbean [name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
	
	
}
