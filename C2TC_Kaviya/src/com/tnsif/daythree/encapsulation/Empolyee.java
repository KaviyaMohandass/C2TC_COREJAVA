package com.tnsif.daythree.encapsulation;

public class Empolyee extends Person {
	private String deptName; 
	private double baseSalary; 
	public Empolyee() { }
	public void Empolyee(String name, long contactNo, int dateOfBirth, String deptName, double baseSalary) { 
	//super(name, contactNo, dateOfBirth); 
	this.deptName = deptName; 
	this.baseSalary = baseSalary; 
	} 
	public String getDeptName() { 
	return deptName; 
	} 
	public void setDeptName(String deptName) { 
	this.deptName = deptName; 
	} 
	public double getBaseSalary() { 
	return baseSalary; 
	} 
	public void setBaseSalary(double baseSalary) { 
	this.baseSalary = baseSalary; 
	} 
	@Override 
	public String toString() { 
	return "Employee ["+super.toString()+", deptName=" + deptName + ", baseSalary=" + baseSalary + 
	"]"; 
	} 
	}
