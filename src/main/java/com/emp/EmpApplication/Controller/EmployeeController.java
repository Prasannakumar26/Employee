package com.emp.EmpApplication.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.EmpApplication.Model.Employee;
import com.emp.EmpApplication.Service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
    @PostMapping()
	public Employee saveEmployee(@RequestBody()Employee emp) {
		Employee employee = employeeService.addEmployee(emp);
		return employee;
	}
    @GetMapping()
    public ArrayList<Employee>getAllEmployee() {
    	ArrayList<Employee> employee = employeeService.getAllEmployee();
    	return employee;
    }
    @PutMapping()
    public Employee updateEmploye(@RequestBody Employee employee) {
    	Employee emp = employeeService.updateEmployee(employee);
    	return emp;
    	
    }
    @GetMapping("/{empId}")
    public Employee getEmployeeById(@PathVariable("{empId}")int empId) {
    	Employee emp = employeeService.getEmployeeById(empId);
    	return emp;
    }
	public void deleteEmployee(int empId) {
		employeeService.deleteEmployee(empId);
	}
	
}
