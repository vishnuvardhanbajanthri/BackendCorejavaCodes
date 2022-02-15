package com.capg.staticdemo;

public class StaticDemo {

	public static void name1() {
		System.out.println("Static Method");
	}

	public void name() {
		System.out.println("non -staticmethod");
	}

	public static void main(String[] args) {
		StaticDemo demo = new StaticDemo();
		demo.name();
		name1();

	}

}
