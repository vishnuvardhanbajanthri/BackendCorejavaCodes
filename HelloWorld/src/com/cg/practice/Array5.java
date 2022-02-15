package com.cg.practice;

public class Array5 {
	public static void main(String[] args) {
		int arr[][][]=new int[5][5][5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					arr[i][j][j2]=420;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					System.out.print(" "+arr[i][j][j2]);
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}

}
