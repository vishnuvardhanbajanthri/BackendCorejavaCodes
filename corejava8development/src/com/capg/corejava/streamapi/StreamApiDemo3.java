package com.capg.corejava.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("254,35,84,698,567,248,6");
		System.out.println("For each loop with Method Reference Print");

		list.stream().distinct().forEach(System.out::println);
	}
}

//O/P
//For each loop with Method Reference Print
//254,35,84,698,567,248,6
