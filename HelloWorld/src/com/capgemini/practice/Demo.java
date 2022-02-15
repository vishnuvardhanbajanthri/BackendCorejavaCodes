package com.capgemini.practice;

import java.util.Hashtable;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

		Stream<Integer> num = Stream.of(10, 20, 30);
		num.map(n -> n + 10).peek(s -> System.out.println(s));
		num.forEach(s -> System.out.println(s));
	}

}
