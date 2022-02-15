package com.capg.corejava.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {
	public static void main(String[] args) {

		ArrayList<Employee> arrayList = new ArrayList<Employee>();

		arrayList.add(new Employee(10, "Vishnu", 24, 30000));
		arrayList.add(new Employee(045, "Ramu", 10, 500000));
		arrayList.add(new Employee(45, "Kiran", 64, 89425));
		arrayList.add(new Employee(75, "Vamsi", 05, 75964));
		arrayList.add(new Employee(01, "Hello", 70, 45897));

		System.out.println("Before sorting ");
		for (Employee employee : arrayList) {
			System.out.println(
					employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
		}
		System.out.println("");
		Collections.sort(arrayList);

		System.out.println("After sorting ");

		for (Employee employee : arrayList) {
			System.out.println(
					employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
		}

	}
}

//O/P
//Before sorting 
//10 Vishnu 24 30000
//37 Ramu 10 500000
//45 Kiran 64 89425
//75 Vamsi 5 75964
//1 Hello 70 45897
//
//After sorting 
//1 Hello 70 45897
//10 Vishnu 24 30000
//37 Ramu 10 500000
//45 Kiran 64 89425
//75 Vamsi 5 75964

