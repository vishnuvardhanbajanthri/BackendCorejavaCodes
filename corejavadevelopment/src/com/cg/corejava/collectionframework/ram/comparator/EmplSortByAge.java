package com.cg.corejava.collectionframework.ram.comparator;

import java.util.Comparator;

public class EmplSortByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.age - e2.age;
	}

}
