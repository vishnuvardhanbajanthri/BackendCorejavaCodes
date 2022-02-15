package com.capg.corejava.serialization;

import java.io.Serializable;

public class StationaryBeen implements Serializable{
	private String staname;
	private int staprice;
	
	public StationaryBeen(String staname, int staprice) {
		this.staname = staname;
		this.staprice = staprice;
	}

	@Override
	public String toString() {
		return "StationaryBeen [staname=" + staname + ", staprice=" + staprice + "]";
	}

}
