package com.capg.corejava.strings;

public class String3 {
	public static void main(String[] args) {
		String str1 = new String("Vishnu");
		String str2 = new String("Vishnu");

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
