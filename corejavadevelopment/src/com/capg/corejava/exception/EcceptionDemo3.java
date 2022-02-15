package com.capg.corejava.exception;

public class EcceptionDemo3 {
	String name = "null";

	public void myData() {

		try {
			System.out.println("One ");

			System.out.println(name.length());

			System.out.println("End..");
		} catch (NullPointerException e) {
			System.out.println("I can handle :" + e);
		}

	}

	public static void main(String[] args) {

		EcceptionDemo3 ed = new EcceptionDemo3();
		ed.myData();

	}
}


//o/p
//One 
//4
//End..
