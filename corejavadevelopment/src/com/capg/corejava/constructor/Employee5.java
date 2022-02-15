package com.capg.corejava.constructor;

public class Employee5 {
	int age;
	String name;
	double salary;

	Employee5() {
		System.out.println("Default metod ");
	}

	public Employee5(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Age :" + age);
		System.out.println("Name :" + name);
		System.out.println("Salary :" + salary);
	}

	public static void main(String[] args) {

		Employee5 employee5 = new Employee5(50, "hari", 75845.25);
		employee5.display();
	}

}
