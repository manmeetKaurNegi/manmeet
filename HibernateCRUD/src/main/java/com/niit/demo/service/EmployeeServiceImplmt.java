package com.niit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.demo.dao.EmployeeDAO;
import com.niit.demo.model.Employee;
@Service
public class EmployeeServiceImplmt implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	public List<Employee> findAll() {
		
		return employeeDAO.findAll();
	}

	public Employee findById(int empId) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(empId);
	}

	public Employee findByName(String name) {
		// TODO Auto-generated method stub
		return employeeDAO.findByName(name);
	}

	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
