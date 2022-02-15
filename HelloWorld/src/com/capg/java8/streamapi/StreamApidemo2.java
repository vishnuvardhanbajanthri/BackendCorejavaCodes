package com.capg.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApidemo2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "Hii", "Vishnu", "vardhan", "Ramu", "vinay", "Anil");
		System.out.println(list);
		System.out.println();
		System.out.println("for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println("for each loop ");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		
		System.out.println("Method reference");
		list.stream().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("lambda with foreach");
		list.forEach(action -> System.out.println(action));
	}
}
