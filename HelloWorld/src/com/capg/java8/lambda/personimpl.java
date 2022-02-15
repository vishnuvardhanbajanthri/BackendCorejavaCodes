package com.capg.java8.lambda;

public class personimpl {
	public static void main(String[] args) {
		person person = () -> {

			{
				System.out.println("Person name is vishnu ");
			}
		};
		person.name();
	}
}
