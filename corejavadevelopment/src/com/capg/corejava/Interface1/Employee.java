package com.capg.corejava.Interface1;

public class Employee implements EmployeeDetails, EmployeeInformation {

	@Override
	public void employemedicalreport() {
		System.out.println("Health is Good ");
	}

	@Override
	public void employeedetails() {
		System.out.println("Employee Name is Vishnu");
	}

	public void details() {
		System.out.println("Local Data ");
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeedetails();
		employee.employemedicalreport();
		employee.details();
	}

}


//o/p
//Employee Name is Vishnu
//Health is Good 
//Local Data 

