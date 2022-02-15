package com.capg.serializable;

import java.io.Serializable;

public class ChocolateBean implements Serializable {
	private int chocoid;
	private String choconame;
	private int chocoprice;

	public ChocolateBean(int chocoid, String choconame, int chocoprice) {
		super();
		this.chocoid = chocoid;
		this.choconame = choconame;
		this.chocoprice = chocoprice;
	}

	@Override
	public String toString() {
		return "ChocolateBean [chocoid=" + chocoid + ", choconame=" + choconame + ", chocoprice=" + chocoprice + "]";
	}
}
