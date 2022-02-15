package com.cg.comprablecomprater.practice;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {
	public static void main(String[] args) {
		ArrayList<ComparableEmployee> arrayList = new ArrayList<ComparableEmployee>();
		arrayList.add(new ComparableEmployee(05, "Vishnu", 20000));
		arrayList.add(new ComparableEmployee(45, "Naresh", 30000));
		arrayList.add(new ComparableEmployee(15, "Ram", 10000));

		System.out.println("Before Sorting ");
		for (ComparableEmployee comparableEmployee : arrayList) {
			System.out.println(comparableEmployee.getId() + " " + comparableEmployee.getEname() + " "
					+ comparableEmployee.getSal());
		}
		System.out.println("");

		Collections.sort(arrayList);
		System.out.println("After Sorting");
		for (ComparableEmployee comparableEmployee : arrayList) {
			System.out.println(comparableEmployee.getId() + " " + comparableEmployee.getEname() + " "
					+ comparableEmployee.getSal());

		}

	}
}
