package com.capg.corejava.array;

public class Array4 {
	public static void main(String[] args) {
		int arr[] = { 125, 885, 557, 668, 459, 254, 789 };

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		for (int i : arr) {
			System.out.println(i);
		}

	}
}
