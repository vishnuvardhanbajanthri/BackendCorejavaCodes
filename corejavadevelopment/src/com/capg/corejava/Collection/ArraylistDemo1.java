package com.capg.corejava.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello");
		arrayList.add("Hii");
		arrayList.add("Vishnu");
		arrayList.add("Ramu");
		arrayList.add("Vishnu");

		System.out.println(arrayList);
			//Or
		for (String s : arrayList)
			System.out.println(s);
		Iterator iterator=arrayList.iterator();
			//Or
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
