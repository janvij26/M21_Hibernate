package com.tns.singleinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR")
public class Manager extends Employee 
{
	private static final long serialVersionUID=1L;
	private String deptName;
	// Getters and Setters Method 
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
	
	
	
	
	
	
}
