package com.capg.corejava.array;

public class ArrayDemo5 {
	public static void main(String[] args) {
		String arr[][][] = new String [4][4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					arr[i][j][j2] = "Hello";
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					System.out.print("  " + arr[i][j][j2]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
