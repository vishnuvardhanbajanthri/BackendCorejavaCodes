package com.capg.Exception.practice;

public class Exceptiondemo {
	String str = null;
	String str1 = "Vishnu";

	public void name1() {
		System.out.println("Start");

//		try {
//			System.out.println(str.length());
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		try {
			System.out.println(str.length());
		} finally {
			System.out.println("This is exception Part");
		}
		
		System.out.println(str1.length());
		System.out.println("End");
		
	}

	public static void main(String[] args) {
		Exceptiondemo exceptiondemo = new Exceptiondemo();
		exceptiondemo.name1();
	}

}
