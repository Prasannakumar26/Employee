package com.emp.EmpApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.EmpApplication.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	

}
