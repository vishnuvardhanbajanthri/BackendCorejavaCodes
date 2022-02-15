package com.cg.corejava.collectionframework.ram.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeImpl {
	public static void main(String[] args) {

		ArrayList<Employee> arrayList = new ArrayList<Employee>();

		arrayList.add(new Employee(145, "Vishnu", 24));
		arrayList.add(new Employee(40, "Kiran", 47));
		arrayList.add(new Employee(57, "Vardhan", 43));
		arrayList.add(new Employee(75, "Sandeep", 20));

		System.out.println("Before Sorting");
		for (Employee employee : arrayList) {
			System.out.println(employee.age + " " + employee.Empname + " " + employee.empno);
		}
		System.out.println("");
		Collections.sort(arrayList, new EmplSortByAge());
		System.out.println("After Sorting");
		for (Employee employee : arrayList) {
			System.out.println(employee.age + " " + employee.Empname + " " + employee.empno);
		}
		System.out.println("");

	}
}

//O/P
//Before Sorting
//24 Vishnu 145
//47 Kiran 40
//43 Vardhan 57
//20 Sandeep 75
//
//After Sorting
//20 Sandeep 75
//24 Vishnu 145
//43 Vardhan 57
//47 Kiran 40


