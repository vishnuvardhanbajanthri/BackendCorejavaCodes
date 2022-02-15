package com.capg.corejava.exception;

public class ExceptionDemo4 {
	String name = "null";

	public void method1() {
		try {
			System.out.println("Start");
			System.out.println(name.length());
			int i = 50 / 0;
			System.out.println(i);

			System.out.println("End..");

		} catch (Exception e) {
			System.out.println("I can handle :" + e);
		}

	}

	public static void main(String[] args) {
		ExceptionDemo4 demo4 = new ExceptionDemo4();
		demo4.method1();
	}
}

//o/p
//Start
//4
//I can handle :java.lang.ArithmeticException: / by zero
