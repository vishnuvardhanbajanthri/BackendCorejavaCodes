package com.capg.corejava.array;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int ar[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				ar[i][j] = 7;
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println();

			for (int j = 0; j < 5; j++) {

				System.out.print(" " + ar[i][j]);
			}
		}
	}
}
