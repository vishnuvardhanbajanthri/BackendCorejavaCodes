package com.capg.corejava.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 5, 88, 75, 35, 62, 95, 2, 65, 75);
		System.out.println("For Each With Method Reference Print ");

		list.stream().limit(4).forEach(System.out::println);
	}
}

//O/P
//For Each With Method Reference Print 
//45
//5
//88
//75
