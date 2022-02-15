package co.capg.collection.practice;

import java.util.LinkedHashSet;

public class Linkedhashdemo {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("red");
		set.add("yellow");
		set.add("white");
		set.add("red");
		set.add(null);
		set.add("orange");
		set.add(null);
		System.out.println(set);
	}

}
