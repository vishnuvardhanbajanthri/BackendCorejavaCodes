package com.capg.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 5, 6, 3, 7);
		System.out.println("For each Loop");
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		System.out.println("Method Reference");
		integers.stream().forEach(System.out::println);
		System.out.println("For loop ");
		for (int i = 0; i < 5; i++) {
			System.out.println(integers.get(i));

		}

	}
}
