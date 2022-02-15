package com.capg.corejava.strings;

public class StringClassMethods {
	public static void main(String[] args) {
		String string = new String("    Hello");
		System.out.println(string.length());
		System.out.println(string.toString());
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string.trim());
	}
}


//o/p
//9
//Hello
//HELLO
//hello
//Hello
