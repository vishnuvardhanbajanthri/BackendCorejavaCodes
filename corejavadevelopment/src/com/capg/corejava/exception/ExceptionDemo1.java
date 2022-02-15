package com.capg.corejava.exception;

public class ExceptionDemo1 {
	String str = "null";

	public void display() {

		System.out.println("One");
		System.out.println(str.length());
		System.out.println("End");
	}

	public static void main(String[] args) {
		ExceptionDemo1 demo1 = new ExceptionDemo1();
		demo1.display();
	}
}

//o/p
//One
//4
//End