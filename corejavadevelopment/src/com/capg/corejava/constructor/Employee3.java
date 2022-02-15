package com.capg.corejava.constructor;

public class Employee3 {
	int empno;
	String name;
	double sal;

	Employee3() {
		System.out.println("Default constructor");
	}

	public Employee3(int empno1, String name1, double sal1) {

		empno = empno1;
		name = name1;
		sal = sal1;
	}

	public void display() {
		System.out.println("Employee No : " + empno);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee sal : " + sal);
	}

	public static void main(String[] args) {
		new Employee3();
		System.out.println();
		Employee3 employee3 = new Employee3(100, "vishnu", 15000);
		employee3.display();
	}

}
