package com.capg.Bean.practice;

public class BeanDemo {
	private String name;
	private int age;
	private int sal;
	private int  employeid;
	
//	public BeanDemo(String name, int age, int sal, int employeid) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.sal = sal;
//		this.employeid = employeid;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getEmployeid() {
		return employeid;
	}
	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	@Override
	public String toString() {
		return "BeanDemo [name=" + name + ", age=" + age + ", sal=" + sal + ", employeid=" + employeid + "]";
	}	
}
