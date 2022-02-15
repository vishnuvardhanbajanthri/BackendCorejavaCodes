package com.capgemini.practice;

public class String2 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";

		if (str1.contentEquals(str2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if (str1 == str2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
}
