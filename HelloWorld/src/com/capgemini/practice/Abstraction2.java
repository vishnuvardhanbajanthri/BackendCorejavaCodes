package com.capgemini.practice;

public class Abstraction2 extends Abstraction1 {

	@Override
	public void abstname() {
		System.out.println("this is abstract method");
	}

	public static void main(String[] args) {
		Abstraction2 abstraction2 = new Abstraction2();
		abstraction2.method1();
		abstraction2.abstname();
	}
	
}
