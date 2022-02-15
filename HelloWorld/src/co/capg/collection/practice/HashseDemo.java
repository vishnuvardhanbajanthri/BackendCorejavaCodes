package co.capg.collection.practice;

import java.util.HashSet;

public class HashseDemo {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Hello");
		set.add("read");
		set.add("vishnu");
		set.add("Hello");
		set.add("45");
		set.add("457.25");

		for (String string : set) {
			System.out.println(string);
		}
	}

}
