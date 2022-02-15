package com.capg.corejava.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo5 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(45, 75, 8, 96, 35, 48);
		System.out.println("For Each Loop with Methods Reference");

		integers.stream().skip(3).forEach(System.out::println);

	}
}


//O/P
//For Each Loop with Methods Reference
//96
//35
//48
