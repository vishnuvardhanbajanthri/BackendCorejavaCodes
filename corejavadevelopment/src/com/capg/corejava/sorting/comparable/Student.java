package com.capg.corejava.sorting.comparable;

public class Student implements Comparable<Student> {
	private int stuid;
	private String stuname;
	private double stusal;

	public Student(int stuid, String stuname, double stusal) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stusal = stusal;
	}

	public int getStuid() {
		return stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public double getStusal() {
		return stusal;
	}

	@Override
	public int compareTo(Student stu) {
		return this.stuid - stu.stuid;
	}

}
