package com.capg.corejava.Static;

public class Statticexample {

	public void nonstaticMethod() {
		StaticMethod();
		System.out.println("This is non static method");
	}

	public static void StaticMethod() {
		System.out.println("This is Static Method ");
	}

	public static void main(String[] args) {
		Statticexample statticexample = new Statticexample();
		statticexample.nonstaticMethod();
	}
}
