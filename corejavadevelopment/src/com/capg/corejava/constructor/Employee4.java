package com.capg.corejava.constructor;

public class Employee4 {
	void Employee4() {
		System.out.println("This is method not constructor because we using void");
	}

	public static void main(String[] args) {
		Employee4 employee4 = new Employee4();
		employee4.Employee4();
	}
}
