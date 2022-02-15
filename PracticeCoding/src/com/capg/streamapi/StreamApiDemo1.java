package com.capg.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo1 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 8, 6, 9, 5, 7, 3);
		System.out.println("for loop");
		for (int i = 0; i < 7; i++) {
			System.out.println(integers.get(i));
		}
		System.out.println("For each loop");
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		System.out.println("Method reference");
		integers.stream().forEach(System.out::println);
	}
}
