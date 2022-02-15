package com.capg.corejava.Static;

public class StaticDemo1 {
	String name = "Vishnu";
	static String name1 = "Vishnuvardhan";

	public void nonstatic() {
		System.out.println("This is NonStatic");
	}

	public static void StaticMethod() {
		System.out.println("This is Static Method ");
	}

	public static void main(String[] args) {
		StaticDemo1 demo = new StaticDemo1();
		demo.nonstatic();
		System.out.println(demo.name);
		System.out.println();
		System.out.println(StaticDemo1.name1);
		StaticDemo1.StaticMethod();

	}
}
