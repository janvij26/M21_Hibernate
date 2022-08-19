package com.tns.client;

import com.tns.entities.Employee;
import com.tns.service.Employee_Service;
import com.tns.service.Employee_Service_Implementation;
import com.tns.service.Employee_Service;
@SuppressWarnings("unused")

public class Client {

	public static void main(String[] args) {
		//Lazy initialization
		Employee_Service service=new Employee_Service_Implementation();
		Employee emp=new Employee();
		
		//create operation
		emp.setID(105);
		emp.setNAME("Sid R");
		service.addEmployee(emp);
		
		//reteive a data
		emp=service.getEmployeeById(102);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());
		
		//update a data
		emp=service.getEmployeeById(102);
		emp.setNAME("Siddhant Rajigare");
		service.updateEmployee(emp);
		
		//retreive a data
		emp=service.getEmployeeById(101);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());
		
		//delete a data
		emp=service.getEmployeeById(104);
		service.removeEmployee(emp);
		
		

	}

}