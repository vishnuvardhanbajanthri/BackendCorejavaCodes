package com.cg.practice;

public class Method1 {

	public void hello() {
		System.out.println("This is Hello Mehod");
	}

	public void hii() {
		System.out.println("This is Hii Method");
	}

	public int number() {
		int i = 10;
		int j = 10;
		int k = i + j;
		return k;

	}

	public void para(int m, int n) {
		System.out.println(m * n);
		System.out.println("This is parameterized constructor calculation ");
	}

	public static void main(String[] args) {
		Method1 method1 = new Method1();
		method1.hello();
		method1.hii();
		method1.number();
		method1.para(2, 5);

	}
}
