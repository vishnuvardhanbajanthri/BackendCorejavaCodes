package com.capg.corejava.oops;

public class Calculater {
	int a = 10, b = 20, c;

	public void add() {
		c = a + b;
		System.out.println("Adding :" + c);
	}

	public void sub() {
		c = a - b;
		System.out.println("Sub :" + c);
	}

	public void multiple() {
		c = a * b;
		System.out.println("Multiple :" + c);
	}

	public void div() {
		c = b / a;
		System.out.println("Divide :" + c);
	}

	public static void main(String[] args) {
		Calculater calculater = new Calculater();
		calculater.add();
		calculater.sub();
		calculater.multiple();
		calculater.div();
	}
}
