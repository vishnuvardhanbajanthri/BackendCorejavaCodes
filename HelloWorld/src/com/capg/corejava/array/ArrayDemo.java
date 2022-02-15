package com.capg.corejava.array;

public class ArrayDemo {
	public static void main(String[] args) {
		int ar[][] = new int[3][3];
		ar[0][0] = 5;
		ar[0][1] = 4;
		ar[0][2] = 3;

		ar[1][0] = 5;
		ar[1][1] = 7;
		ar[1][2] = 28;

		ar[2][0] = 51;
		ar[2][1] = 75;
		ar[2][2] = 45;

		for (int i = 0; i < ar.length; i++) {
			System.out.println();
			for (int j = 0; j < ar.length; j++) {
				System.out.print(" " + ar[i][j]);
			}
		}

	}
}
