package com.cg.practice;

public class Array3 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = 2 * j;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print("  " + arr[i][j]);
			}
			System.out.println();
		}
	}

}
