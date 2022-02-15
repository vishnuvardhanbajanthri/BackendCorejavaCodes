package com.capg.serializable;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private int prodid;
	private String prodname;
	private double prodprice;
	
	public ProductBean(int prodid, String prodname, double prodprice) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodprice = prodprice;
	}

	@Override
	public String toString() {
		return "ProductBean [prodid=" + prodid + ", prodname=" + prodname + ", prodprice=" + prodprice + "]";
	}

}
