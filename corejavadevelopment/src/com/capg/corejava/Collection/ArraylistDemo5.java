package com.capg.corejava.Collection;

import java.util.ArrayList;

public class ArraylistDemo5 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(45);
		arrayList.add(85);
		arrayList.add(65);
		arrayList.add("Hello");
		arrayList.add("Hii");
		arrayList.add(45.25);
		arrayList.add(25.44);

		System.out.println(arrayList);
		System.out.println("");
		for (Object object : arrayList) {
			System.out.println(object);
		}

	}
}
