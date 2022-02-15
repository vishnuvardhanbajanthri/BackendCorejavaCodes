package com.cg.practice;

public class overload {

	public void method1() {
		System.out.println("method 1");
	}

	public void method1(int i) {
		System.out.println("method 2");
	}

	public void method1(int i, int j) {
		System.out.println("Method 3");
	}

	public void method1(int i, int j, int k) {
		System.out.println("method 4");
	}

	public void method1(boolean b) {
		System.out.println("method 5");
	}

	public static void main(String[] args) {
		overload overload = new overload();
		overload.method1();
		overload.method1(false);
		overload.method1(5);
		overload.method1(4, 7);
		overload.method1(4, 8, 7);
	}
}
