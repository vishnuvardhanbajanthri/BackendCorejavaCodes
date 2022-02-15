package com.capg.java8.lambda;

public class foodimpl {
	public static void main(String[] args) {
		food food = (foodname) -> {

			{
				System.out.println("Milk : "+ foodname);
			}
		};
		food.food("biscates");
	}
}
