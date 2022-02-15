package com.capg.corejava.Collection;

import java.io.Serializable;

public class EmployeeBean implements Serializable{
	private int eno; //0  100
	private String ename;//null Ramesh
	private double sal; //0.0 55000
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

}
