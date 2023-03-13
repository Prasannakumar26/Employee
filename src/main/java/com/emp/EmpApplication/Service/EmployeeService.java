package com.emp.EmpApplication.Service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.EmpApplication.Model.Employee;
import com.emp.EmpApplication.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;
	
	
	public Employee addEmployee(Employee emp) {
		Employee employ = empRepository.save(emp);
		return employ;
	}
	public Employee updateEmployee(Employee emp) {
		Employee employ = empRepository.save(emp);
		return employ;
	}
	public ArrayList<Employee> getAllEmployee() {
		Collection<Employee> employee = empRepository.findAll();
		ArrayList<Employee> emp = new ArrayList<Employee>(employee);
		return emp;
	}
	public Employee getEmployeeById (int empId) {
        /* Throw exception if user was not found*/
        return empRepository.findById(empId).orElseThrow(IllegalArgumentException::new);
    }
	public void deleteEmployee(int empId) {
                 empRepository.deleteById(empId);
	}
	
	
}