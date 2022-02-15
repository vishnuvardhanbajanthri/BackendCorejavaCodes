package com.capgemini.practice;

public class BiggestThree {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;

		if (a > b && a > c)
			System.out.println("A is big : " + a);
		else if (b > a && b > c)
			System.out.println("B is big : " + b);
		else
			System.out.println("c is big : " + c);
	}
}
