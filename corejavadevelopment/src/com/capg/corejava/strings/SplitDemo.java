package com.capg.corejava.strings;

public class SplitDemo {
	public static void main(String[] args) {
		String str = "Hello&Java&JDBC&Spring";
		str.split("&");
		
		for (String string : args) {
			System.out.println(string);
		}
	}
}
