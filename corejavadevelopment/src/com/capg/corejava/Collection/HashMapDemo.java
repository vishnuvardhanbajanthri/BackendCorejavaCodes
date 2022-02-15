package com.capg.corejava.Collection;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		 
		EmployeeBean empBean=new EmployeeBean();
		
		HashMap myMap=new HashMap();
		myMap.put(9989,"Ramesh , abc");
		myMap.put(100,"Stduent Info");
		myMap.put(200,"Raju , abc");
		myMap.put(300,"Bhanu Info");
		myMap.put(null,"Hello");
		myMap.put(500,null);
		myMap.put(empBean,"employee");	
		myMap.put("emp",new EmployeeBean());
		
		System.out.println(myMap);

	}
}
