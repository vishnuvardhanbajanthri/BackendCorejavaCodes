package com.capg.corejava.Collection;

import java.util.HashMap;
import java.util.Iterator;

public class EmployeeHashMap {
	public static void main(String[] args) {
		EmployeeDetails details = new EmployeeDetails();
		HashMap myMap = new HashMap();

		myMap.put(9989, "Ramesh , abc");
		myMap.put(100, "Stduent Info");
		myMap.put(200, "Raju , abc");
		myMap.put(300, "Bhanu Info");
		myMap.put(null, "Hello");
		myMap.put(500, null);

		System.out.println(myMap);

	}
}

//O/P

//{null=Hello, 100=Stduent Info, 500=null, 9989=Ramesh , abc, 200=Raju , abc, 300=Bhanu Info}
