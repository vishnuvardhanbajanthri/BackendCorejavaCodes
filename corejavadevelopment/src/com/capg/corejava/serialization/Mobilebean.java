package com.capg.corejava.serialization;

import java.io.Serializable;

public class Mobilebean implements Serializable {
	
	private int mobileid;
	private String mobilename;
	private double mobileprice;
	
	public Mobilebean(int mobileid, String mobilename, double mobileprice) {
		super();
		this.mobileid = mobileid;
		this.mobilename = mobilename;
		this.mobileprice = mobileprice;
	}
	
	@Override
	public String toString() {
		return "Mobilebean [mobileid=" + mobileid + ", mobilename=" + mobilename + ", mobileprice=" + mobileprice + "]";
	}
	
}
