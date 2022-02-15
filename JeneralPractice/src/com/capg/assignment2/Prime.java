package com.capg.assignment2;

import java.util.Scanner;

public class Prime {

	public static boolean isprime(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (isprime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
