package com.tnsif.daythree.encapsulation;

public class Level extends Empolyee  {
	private int noOfShares; 
	private String authority; 
	public Level() {} 
	public void LevelOneEmployee(String name, long contactNo, int dateOfBirth,String deptName, double 
	baseSalary, int noOfShares, String authority) { 
	//super(name,contactNo,dateOfBirth,deptName, baseSalary); 
	this.noOfShares = noOfShares; 
	this.authority=authority; 
	} 
	public int getNoOfShares() { 
	return noOfShares; 
	} 
	public void setNoOfShares(int noOfShares) { 
	this.noOfShares = noOfShares; 
	} 
	public String getAuthority() { 
	return authority; 
	} 
	public void setAuthority(String authority) { 
	this.authority = authority; 
	} 
	public String toString() { 
	return "LevelOneEmployee ["+super.toString()+"noOfShares=" + noOfShares + ", authority=" + 
	authority + "]"; 
	}  
	}

