package com.capg.jpacurd.client;

import com.capg.jpacrud.service.EmployeeService;
import com.capg.jpacrud.service.EmployeeServiceImpl;
import com.capg.jpacurd.entities.Employee;

public class MainController {
	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		
		Employee employee=new Employee();
		employee.setEmployeeid(550);
		employee.setName("vishnu");
		employeeService.addemployee(employee);
		
		//added one record to table
		employee=employeeService.findemployeebyid(550);
		System.out.println("Id:"+employee.getEmployeeid());
		System.out.println("Name: "+employee.getName());
		
		
		employee.setName("vishnu vardhan");
		employeeService.updateemployee(employee);
		
		//we have updated  record  add in first section
		employee=employeeService.findemployeebyid(550);
		System.out.println("Id:"+employee.getEmployeeid());
		System.out.println("Name: "+employee.getName());
		
		//record is removed from table 
		employeeService.removeemployee(employee);
		System.out.println("Program Ended ");
		
	}
}
