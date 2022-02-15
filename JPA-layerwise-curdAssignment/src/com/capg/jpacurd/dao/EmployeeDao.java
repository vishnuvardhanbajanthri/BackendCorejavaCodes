package com.capg.jpacurd.dao;

import com.capg.jpacurd.entities.Employee;

public interface EmployeeDao {
	
	public abstract Employee getStudentById(int id);

	public abstract void addEmployee(Employee employee);

	public abstract void removeEmployee(Employee employee);

	public abstract void updateEmployee(Employee employee);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
