package com.capg.corejava.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class productsort {
	public static void main(String[] args) {
		ArrayList<product> arrayList = new ArrayList<product>();
		arrayList.add(new product("Prod1", 58694, 14));
		arrayList.add(new product("prod5", 15246, 7));
		arrayList.add(new product("prod7", 48597, 50));
		arrayList.add(new product("prod10", 68459, 5));

		System.out.println("Before Sorting");
		for (product product : arrayList) {
			System.out.println(product.getProprice() + " " + product.getProquantity() + " " + product.getProduct());
		}
		System.out.println("");
		Collections.sort(arrayList);
		System.out.println("After Sorting ");
		for (product product : arrayList) {
			System.out.println(product.getProprice() + " " + product.getProquantity() + " " + product.getProduct());
		}
	}
}
