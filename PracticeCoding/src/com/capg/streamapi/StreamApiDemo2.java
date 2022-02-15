package com.capg.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 8, 4, 6, 3, 9);
		System.out.println("Method reference ");
		list.stream().forEach(System.out::println);
		System.out.println("For loop");
		for (int i = 0; i < 6; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("for loop");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
