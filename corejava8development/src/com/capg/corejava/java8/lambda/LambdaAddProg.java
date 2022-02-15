package com.capg.corejava.java8.lambda;

interface Addition {
	public int sum(int a, int b);
}

public class LambdaAddProg {
	public static void main(String[] args) {
		Addition addition = (x, y) -> {
			int sum = x + y;
			return sum;

		};
		System.out.println("Sum : " + addition.sum(2, 5));
	}
}

//O/P
//Sum : 7