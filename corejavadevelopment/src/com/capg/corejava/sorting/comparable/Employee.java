package com.capg.corejava.sorting.comparable;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private int age;
	private long salary;
	
	
	
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public long getSalary() {
		return salary;
	}



	@Override
	public int compareTo(Employee emp) {
		return (this.id-emp.id);
	}

}
