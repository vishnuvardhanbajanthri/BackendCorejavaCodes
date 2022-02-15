package com.capg.Exception.practice;

public class ExceptionDemo2 {
	String str = "Hello";

	public void name1() {
		try {
			System.out.println("Start");
			System.out.println(str.length());

			int d = 10 / 0;
			System.out.println(d);

//			System.out.println("End");
		} 
//			catch (NullPointerException e) {
//			System.out.println(e);
//		} catch (StackOverflowError e) {
//			System.out.println(e);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		finally {
			System.out.println("end");
		}
		
	}

	public static void main(String[] args) {
		ExceptionDemo2 demo2 = new ExceptionDemo2();
		demo2.name1();
	}
}
