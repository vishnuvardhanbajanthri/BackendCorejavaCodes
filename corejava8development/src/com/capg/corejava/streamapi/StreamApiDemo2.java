package com.capg.corejava.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiDemo2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("11,25,65,5,9,68,75,36");
		System.out.println("For each with method Reforance ");

		list.stream().forEach(System.out::println);
	}
}

//O/P
//For each with method Reforance 
//11,25,65,5,9,68,75,36