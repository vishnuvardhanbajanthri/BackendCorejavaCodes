package com.cg.comprablecomprater.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentImpl {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(20, "Ramu", 70));
		arrayList.add(new Student(8, "varun", 40));
		arrayList.add(new Student(70, "kiran", 35));
		arrayList.add(new Student(45, "gopal", 56));

		System.out.println("Before Sorting");
		for (Student student : arrayList) {
			System.out.println(student.ename + " " + student.stuid + " " + student.perc);
		}
		System.out.println("");
		Collections.sort(arrayList, new Studentsortper());
		System.out.println("After Sorting");

		for (Student student : arrayList) {
			System.out.println(student.ename + " " + student.stuid + " " + student.perc);
		}

	}

}
