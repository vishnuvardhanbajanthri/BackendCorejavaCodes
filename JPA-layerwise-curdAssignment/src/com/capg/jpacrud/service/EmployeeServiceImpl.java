package com.capg.jpacrud.service;

import com.capg.jpacurd.dao.EmployeeDao;
import com.capg.jpacurd.dao.EmployeeDaoImpl;
import com.capg.jpacurd.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao;
	public  EmployeeServiceImpl() {
		dao= new EmployeeDaoImpl();
	}
	
	@Override
	public void addemployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
	}

	@Override
	public void updateemployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		
	}

//	@Override
//	public void removeemployee(Employee employee) {
//		dao.beginTransaction();
//		dao.removeEmployee(employee);
//		dao.commitTransaction();
//	}

	@Override
	public Employee findemployeebyid(int id) {
		Employee employee=dao.getStudentById(id);
		return employee;
	}

	@Override
	public void removeemployee(Employee employee) {
		
	}

}
