package com.capg.corejava.java8.lambda;

interface food {
	public void food1(String foodname);

}

public class lambdaparaprog {
	public static void main(String[] args) {
		food food = (foodname) -> {

			{
				System.out.println("Milk : " + foodname);
			}
		};

		food.food1("Biscates");
	}

}
//
//O/P
//Milk : Biscates
