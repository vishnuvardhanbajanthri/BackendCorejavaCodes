package com.capg.corejava.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("Hello");
		hashSet.add(45);
		hashSet.add(78);
		hashSet.add(89);
		hashSet.add(45);
		hashSet.add("hii");
		System.out.println(hashSet);

		Iterator i1 = hashSet.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

	}
}
