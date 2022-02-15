package com.capg.corejava.Static;

public class StaticDemo3 {
	static String name = "Vishnu";

	public static void StaticMethod() {
		System.out.println("Static Variable :" + name);
	}

	public static void main(String[] args) {
		StaticMethod();
		System.out.println(name);
	}

}



//        o/p
//  Static Variable :Vishnu       
//  Vishnu