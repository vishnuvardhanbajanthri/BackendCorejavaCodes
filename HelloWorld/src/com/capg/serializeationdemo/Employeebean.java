package com.capg.serializeationdemo;

import java.io.Serializable;

public class Employeebean implements Serializable{
	private int age;
	private String name;
	private int salary;
	
	public Employeebean(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SerializationDemo [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

}
