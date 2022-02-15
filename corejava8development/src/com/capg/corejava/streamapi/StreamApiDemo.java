package com.capg.corejava.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 6, 4, 7);

		System.out.println("For Loop");
		for (int i = 0; i < 6; i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Method Reference Print");
		list.stream().forEach(System.out::println);

		System.out.println("for each loop");
		for (Integer integer : list) {
			System.out.println(integer);
		}

		System.out.println("for each loop with Lambda");

		list.forEach(integer -> System.out.println(integer));

	}
}
//O/p
//For Loop
//1
//2
//3
//6
//4
//7
//Method Reference Print
//1
//2
//3
//6
//4
//7
//for each loop
//1
//2
//3
//6
//4
//7
//for each loop with Lambda
//1
//2
//3
//6
//4
//7
