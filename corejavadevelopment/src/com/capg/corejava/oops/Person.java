package com.capg.corejava.oops;

public class Person {
	int age = 22;
	String name = "vishnu";
	int id = 101;

	public void personmet() {
		System.out.println("Person name :" + name);
		System.out.println("Person age :" + age);
		System.out.println("Person id :" + id);
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.personmet();
	}
}
