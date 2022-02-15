package com.capg.corejava.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo7 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "I am", "Good");
		System.out.println("For each loop with method Reference ");

		list.stream().map(str -> str.length()).forEach(System.out::println);
	}
}

//O/P
//For each loop with method Reference 
//5
//4
//4