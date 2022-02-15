package com.cg.comprablecomprater.practice;

import java.util.Comparator;

public class Studentsortper implements Comparator<Student> {

	@Override
	public int compare(Student perc1, Student perc2) {
		return perc1.stuid - perc2.stuid;
	}

}
