package com.tns.service;

import com.tns.dao.EmployeeDao;
import com.tns.dao.EmployeeDao_Implementation;
import com.tns.entities.Employee;

public class Employee_Service_Implementation implements Employee_Service
{
	private EmployeeDao dao;
	
	public Employee_Service_Implementation() {
		super();
		dao=new EmployeeDao_Implementation();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee getEmployeeById(int ID) {
		Employee emp=dao.getEmployeeById(ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		dao.beginTransaction();
		dao.removeEmployee(emp);
		dao.commitTransaction();
		
	}
	

}