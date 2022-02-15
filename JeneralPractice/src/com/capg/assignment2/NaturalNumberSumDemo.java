package com.capg.assignment2;

import java.util.Scanner;

public class NaturalNumberSumDemo {
	public static void calculateSum(int n) {
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Number ");
		int n = sc.nextInt();
		calculateSum(n);
	}
}
