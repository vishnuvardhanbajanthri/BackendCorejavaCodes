package com.capg.corejava.java8.lambda;

@FunctionalInterface
interface Add {
	public int addition(int a, int b);
}

public class LambdaAdd {
	public static void main(String[] args) {
		Add add = (x, y) -> {

			int sum = x + y;
			return sum;
		};
		System.out.println("sum : " + add.addition(5, 23));
	}
}
