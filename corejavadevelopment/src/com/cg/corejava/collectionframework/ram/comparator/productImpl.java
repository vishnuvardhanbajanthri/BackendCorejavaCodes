package com.cg.corejava.collectionframework.ram.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class productImpl {
	public static void main(String[] args) {
		ArrayList<product> arrayList = new ArrayList<product>();
		arrayList.add(new product(45, "Apple", 12));
		arrayList.add(new product(04, "orange", 7));
		arrayList.add(new product(52, "grapse", 1));

		System.out.println("Before Sorting");
		for (product product : arrayList) {
			System.out.println(product.price + " " + product.name + " " + product.prodid);
		}
		System.out.println("");
		Collections.sort(arrayList, new productsortbyprice());
		System.out.println("After Sorting");
		for (product product : arrayList) {
			System.out.println(product.price + " " + product.name + " " + product.prodid);
		}
	}
}


//O/P
//Before Sorting
//45 Apple 12
//4 orange 7
//52 grapse 1
//
//After Sorting
//4 orange 7
//45 Apple 12
//52 grapse 1
