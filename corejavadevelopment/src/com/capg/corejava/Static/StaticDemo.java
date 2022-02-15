package com.capg.corejava.Static;

public class StaticDemo {
	static String countryname = "India";

	public static void myData() {
		System.out.println("My Countryname :" + countryname);
	}

	public static void main(String[] args) {
		StaticDemo.myData();
		System.out.println(StaticDemo.countryname);
	}

}
