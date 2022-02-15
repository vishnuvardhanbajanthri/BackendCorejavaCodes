package com.cg.naresh;

import java.util.Scanner;
import java.util.Stack;

public class StackEcamples {
	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		// Display Stack
		System.out.println("s:" + s);
		System.out.println(s.search(40));

		Object ele = s.pop();
		// Display Popped Element
		System.out.println("s.pop(): " + ele);

		// Display Updated Stack
		System.out.println("s:" + s);

		// print element
		for (Integer integer : s) {
			System.out.println(integer);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to print  ");
		int n = sc.nextInt();
		if (n == s.search(10)) {
			System.out.println(10);
		} else if (n == s.search(20)) {
			System.out.println(20);
		} else if (n == s.search(30)) {
			System.out.println(30);
		} else if (n == s.search(40)) {
			System.out.println(40);
		} else if (n == s.search(50)) {
			System.out.println(50);
		} else {
			System.out.println("Insert data is not presented");

		}

	}

}
