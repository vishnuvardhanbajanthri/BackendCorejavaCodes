package com.cg.corejava.collectionframework.ram.comparator;

import java.util.Comparator;

public class SortByStudentName implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.sname.compareTo(s2.sname);
	}
	
	

}