package com.cg.practice;

public class Constructor3 {
	int age = 40;
	String name = "ramu";
	double sal = 2540.25;

	public Constructor3(int age, String name, double sal) {
		super();
		this.age = age;
		this.name = name;
		this.sal = sal;
		System.out.println(age+" "+name+" "+sal);
	} 

	public static void main(String[] args) {
		Constructor3 constructor3 = new Constructor3(45, "Vishnu", 54687);
		constructor3.toString();
	}

}
