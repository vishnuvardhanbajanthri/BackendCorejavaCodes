package com.capg.corejava.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();

		arrayList.add(new Student(214, "Vishnu", 2500.25));
		arrayList.add(new Student(111, "Ramu", 325.02));
		arrayList.add(new Student(425, "Vardhan", 325.25));

		System.out.println("Before Sorting ");
		for (Student student : arrayList) {
			System.out.println(student.getStuname() + " " + student.getStuid() + " " + student.getStusal());
		}

		System.out.println(" ");

		Collections.sort(arrayList);

		System.out.println("After Sorting");
		for (Student student : arrayList) {
			System.out.println(student.getStuname() + " " + student.getStuid() + " " + student.getStusal());
		}

	}
}
