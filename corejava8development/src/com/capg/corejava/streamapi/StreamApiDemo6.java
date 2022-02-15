package com.capg.corejava.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo6 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("For Each Loop with Methods Reference");

		integers.stream().map(i -> i * i).forEach(System.out::println);
	}
}


//O/P
//For Each Loop with Methods Reference
//1
//4
//9
//16
//25
//36
//49
//64