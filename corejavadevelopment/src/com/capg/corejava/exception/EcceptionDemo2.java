package com.capg.corejava.exception;

public class EcceptionDemo2 {
	String str = null;

	public void name1() {
		System.out.println("Start");
		System.out.println(str.length());
		System.out.println("End");
	}

	public static void main(String[] args) {
		EcceptionDemo2 demo2 = new EcceptionDemo2();
		demo2.name1();
	}
}

//o/p
//
//Exception in thread "main" Start
//java.lang.NullPointerException
//	at com.capg.corejava.exception.EcceptionDemo2.name1(EcceptionDemo2.java:8)
//	at com.capg.corejava.exception.EcceptionDemo2.main(EcceptionDemo2.java:14)