package com.capg.assignment2;

import java.util.Scanner;

public class Cubes {
	public static int cube(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum  =sum+ i * i * i;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n = sc.nextInt();
		System.out.println(cube(n));
	}
}
