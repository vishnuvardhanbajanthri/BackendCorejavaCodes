package com.cg.corejava.collectionframework.ram.comparator;

import java.util.Comparator;

public class productsortbyprice implements Comparator<product> {

	@Override
	public int compare(product pro1, product pro2) {
		return pro1.price - pro2.price;
	}

}
