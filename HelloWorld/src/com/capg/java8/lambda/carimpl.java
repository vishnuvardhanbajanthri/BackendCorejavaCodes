package com.capg.java8.lambda;

public class carimpl {
	public static void main(String[] args) {
		car car = () -> {

			{
				System.out.println("car rides at 160 km/ph");
			}
		};
		car.speed();
	}
}
