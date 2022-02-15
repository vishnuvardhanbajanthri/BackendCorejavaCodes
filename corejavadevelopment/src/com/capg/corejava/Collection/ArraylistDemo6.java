package com.capg.corejava.Collection;

import java.util.ArrayList;

public class ArraylistDemo6 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(45);
		arrayList.add(57);
		arrayList.add(35);
		arrayList.add(28);
		arrayList.add(98);
		System.out.println(arrayList);
		System.out.println("");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
	}
}
