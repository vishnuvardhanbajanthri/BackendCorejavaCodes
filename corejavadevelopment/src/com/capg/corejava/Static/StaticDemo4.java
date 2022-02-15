package com.capg.corejava.Static;

public class StaticDemo4 {
	static String name = "vishnu";

	static {
		System.out.println("Static Block");
	}

	public static void Staticmethod() {
		System.out.println("This is static method ");
	}

	public static void main(String[] args) {
		StaticDemo4.Staticmethod();
		System.out.println(StaticDemo4.name);
	}

}

//                   o/p
//             Static Block
//             This is static method 
//             vishnu