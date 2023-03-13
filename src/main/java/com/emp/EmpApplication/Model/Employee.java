package com.emp.EmpApplication.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Column
	private String empName;
	@Column
	private String email;
	@Column
	private String mobileNumber;
	
	public Employee() {}
	public Employee(Integer empId, String empName,String email,String mobileNumber) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

}
