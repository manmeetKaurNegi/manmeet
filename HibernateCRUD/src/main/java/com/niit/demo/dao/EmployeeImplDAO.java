package com.niit.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.demo.model.Employee;

@Repository("employeeDao")
@Transactional
public class EmployeeImplDAO implements EmployeeDAO {
	
	@Autowired
	private  SessionFactory sessionFactory;

	public List<Employee> findAll() {
		
		return sessionFactory.getCurrentSession()
				.createQuery("from Employee")
				.list();
	}

	public Employee findById(int empId) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where empId="+empId)
				.uniqueResult();
	}

	public Employee findByName(String name) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where empName='"+name+"'")
				.uniqueResult();
	}

	public boolean addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	public boolean deleteEmployee(int empId) {
		
		sessionFactory.getCurrentSession().delete(findById(empId));	
		return true;
	}

	public boolean validateEmployee(String email, String password) {
Query query = sessionFactory.getCurrentSession().createQuery("from Employee where email='"+email+"' and password ='"+password+"'");
		
		Employee employee= (Employee) query.uniqueResult();
		
		if(employee != null)
			return true;
		else
			return false;
	}
	
	

}
