package com.capg.corejava.serialization;

import java.io.Serializable;

public class StudentInfoBean implements Serializable {
	private int stuid;
	private String stuname;
	private double percentage;

	public StudentInfoBean(int stuid, String stuname, double percentage) {
		this.stuid = stuid;
		this.stuname = stuname;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "StudentInfoBean [stuid=" + stuid + ", stuname=" + stuname + ", percentage=" + percentage + "]";
	}

}
