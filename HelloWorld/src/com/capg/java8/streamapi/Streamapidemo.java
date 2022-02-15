package com.capg.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streamapidemo {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(4, 5, 3, 9, 7, 2, 5, 6, 48);
		System.out.println("for loop");
		for (int i = 0; i < integers.size(); i++) {
			System.out.println(integers.get(i));
		}
		System.out.println("Foreach loop");
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		System.out.println("Method reference ");
		integers.stream().forEach(System.out::println);
		System.out.println("For each loop with lambda ");
		integers.forEach(action -> System.out.println(action));
	}
}
