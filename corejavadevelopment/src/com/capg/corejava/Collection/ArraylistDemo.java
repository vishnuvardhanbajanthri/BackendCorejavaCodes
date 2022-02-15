package com.capg.corejava.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add(100);
		arrayList.add("Hello");
		arrayList.add(45);
		arrayList.add(10.0);
		arrayList.add(100);
		arrayList.add("Hii");

		System.out.println(arrayList);

		Iterator i1 = arrayList.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
