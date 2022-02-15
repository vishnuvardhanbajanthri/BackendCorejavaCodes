package com.capg.corejava.oops;

class MyTest {
	public void show() {
		System.out.println("Mytest class show method");
	}
}

public class OverridingDemo extends MyTest {
	public void show() {
		System.out.println("This is overriden Method ");
	}

	public static void main(String[] args) {
		OverridingDemo demo = new OverridingDemo();
		demo.show();
		MyTest myTest = new MyTest();
		myTest.show();
	}
}
