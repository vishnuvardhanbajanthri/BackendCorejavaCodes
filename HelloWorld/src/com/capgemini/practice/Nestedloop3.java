package com.capgemini.practice;

public class Nestedloop3 {
	public static void main(String[] args) {
		int k = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				k = k + 1;
				System.out.print(k + " ");
			
			}
			System.out.println();
		}
	}

}
