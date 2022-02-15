package co.capg.collection.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Vishnu");
		list.add("Naresh");
		list.add("45");
		list.add("45.25");
		list.add("78945");

		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("");
		System.out.println(list.get(4));
	}

}
