package co.capg.collection.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistDemo {
	public static void main(String[] args) {

//		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("45");
		arrayList.add("87");
		arrayList.add("77");
		arrayList.add("878");
		arrayList.add("867");
		arrayList.add("487");
		arrayList.add("873");
		arrayList.add("Vishnu");
		arrayList.add("54.89");

////		System.out.println(arrayList);
//		System.out.println("");
//		for (Object object : arrayList) {
//			System.out.println(object);
//		}
//		System.out.println();
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}

//		Iterator iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		System.out.println(arrayList.indexOf(87));
//		ListIterator<Object> itr= arrayList.listIterator();
//		while (itr.hasNext()) {
//			Object obj=itr.next();
//			System.out.println(obj);
//		}

		ListIterator<String> itr = arrayList.listIterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("");

		ListIterator<String> itr1 = arrayList.listIterator();
		while (itr.hasPrevious()) {
			String name1 = itr.previous();
			System.out.println(name1);
		}

	}

}
