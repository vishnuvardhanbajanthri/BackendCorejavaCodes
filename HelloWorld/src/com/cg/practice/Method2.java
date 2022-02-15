package com.cg.practice;

public class Method2 {

	public static void hii() {
		System.out.println("hii method ");
	}

	public static void hello() {
		System.out.println("Hello method");
	}

	public static int add(int i, int j) {
		int k = i * j;
		System.out.println(k);
		System.out.println("");
		return k;
	}

	public static void main(String[] args) {
		Method2.hii();
		Method2.hello();
		Method2.add(4, 8);
	}
}
