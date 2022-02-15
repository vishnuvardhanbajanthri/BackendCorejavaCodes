package com.capg.corejava.exception;

public class ExceptionDemo5 {
	String name = "null";

	public void myData() {
		try {
			System.out.println("One ");

			System.out.println(name.length());

			int d = 10 / 0;
			System.out.println(d);

			System.out.println("End..");
		} catch (NullPointerException e) {
			System.out.println("I can handle :" + e);
		} catch (ArithmeticException e) {
			System.out.println("I can handle :" + e);
		} catch (Exception e) {
			System.out.println("I can handle :" + e);
		} finally {
			System.out.println("Finally block for Closing connection ");
		}

	}

	public static void main(String[] args) {

		ExceptionDemo5 demo5 = new ExceptionDemo5();
		demo5.myData();
	}
}


//o/p
//One 
//4
//I can handle :java.lang.ArithmeticException: / by zero
//Finally block for Closing connection
