package com.capgemini.practice;

public class Factorial {
	public static void main(String[] args) {
		int f = 5, n = 1;
		int fact = 1;
		while (n <= f) {
			fact = fact * n;
			n++;
		}
		System.out.println(fact);
	}
}
