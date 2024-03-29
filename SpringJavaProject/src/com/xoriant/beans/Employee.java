package com.xoriant.beans;

public class Employee {
	private int empId;
	private String empName;
	private String designation;
	private Address address;
	
	public Employee() {
		System.out.println("Employee Class");
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (empId+" "+empName+" "+designation+" "+address);
	}

}
