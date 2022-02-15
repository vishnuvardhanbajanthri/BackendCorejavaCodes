package com.cg.studentdet;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private int stuid ;
	private String stuname;
	private double stuperc;
	private String grade;
	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public double getStuperc() {
		return stuperc;
	}
	public void setStuperc(double stuperc) {
		this.stuperc = stuperc;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
