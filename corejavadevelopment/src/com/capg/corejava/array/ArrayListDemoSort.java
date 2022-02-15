package com.capg.corejava.array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemoSort {
	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add(200);
		arrayList.add(100);
		arrayList.add(145);
		arrayList.add(548);
		arrayList.add(879);
		arrayList.add(358);

		System.out.println("Before Sorting ");
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println("After Sorting ");
		System.out.println(arrayList);
	}
}

//O/P
//Before Sorting 
//[200, 100, 145, 548, 879, 358]
//After Sorting 
//[100, 145, 200, 358, 548, 879]