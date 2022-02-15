package com.capg.corejava.array;

public class Method {

	public void Hello() {
		System.out.println("this is non static method ");
	}

	public static void hello1() {
		System.out.println("This is static mehod");
	}

	public static void main(String[] args) {
		Method method = new Method();
		method.Hello();
		Method.hello1();

	}
}
