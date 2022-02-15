package com.capg.java8.lambda;

public class penimpl {
	public static void main(String[] args) {
		pen pen = () -> {

			{
				System.out.println("Pen rights");
			}
		};
		pen.name();
	}
}
