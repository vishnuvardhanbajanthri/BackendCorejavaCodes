package com.capg.java8.lambda;

public class babyimpl {
	public static void main(String[] args) {
		baby baby = (String crying) -> {

			{
				System.out.println("Baby : "+ crying);
			}
		};
		baby.cry("Roring");;
	}
}
