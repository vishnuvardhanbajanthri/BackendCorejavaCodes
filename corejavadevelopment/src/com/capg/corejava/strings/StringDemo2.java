package com.capg.corejava.strings;

public class StringDemo2 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		if (str1.contentEquals(str2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (str1 == str2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}


//o/p
//True
//False