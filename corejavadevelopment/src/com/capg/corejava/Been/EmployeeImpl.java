package com.capg.corejava.Been;

public class EmployeeImpl {
	public static void main(String[] args) {
		EmployeeBean bean = new EmployeeBean();
		bean.setEmpname("Vishnu");
		bean.setEmpid(101);
		bean.setSalary(20000.0);

		System.out.println("Employee Name is :" + bean.getEmpname());
		System.out.println("Employee Id is :" + bean.getEmpid());
		System.out.println("Employee Salary is :" + bean.getSalary());
	}
}
