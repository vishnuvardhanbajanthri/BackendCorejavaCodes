package com.capg.jpacrud.service;

import com.capg.jpacurd.entities.Employee;

public interface EmployeeService {
	public abstract void addemployee(Employee employee);
	public abstract void updateemployee(Employee employee);
	public abstract void removeemployee(Employee employee);
	public abstract Employee findemployeebyid(int id);
}
