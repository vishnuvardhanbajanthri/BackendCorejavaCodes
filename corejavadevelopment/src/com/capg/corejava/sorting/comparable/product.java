package com.capg.corejava.sorting.comparable;

public class product implements Comparable<product> {
	private String product;
	private double proprice;
	private int proquantity;

	public product(String product, double proprice, int proquantity) {
		super();
		this.product = product;
		this.proprice = proprice;
		this.proquantity = proquantity;
	}

	public String getProduct() {
		return product;
	}

	public double getProprice() {
		return proprice;
	}

	public int getProquantity() {
		return proquantity;
	}

	@Override
	public int compareTo(product ptu) {
		return this.proquantity - ptu.proquantity;
	}
}
