package com.capg.java8.lambda;

public class addingimpl {
	public static void main(String[] args) {
		Adding adding = (int x, int y) -> {

			{
				int sum = x + y;
				System.out.println("Adding of two numbers : " + sum);
			}
		};
		adding.add(47, 85);

	}
}
