package com.niit.demo;

import static org.junit.Assert.*;

import org.hibernate.exception.ConstraintViolationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.demo.config.ApplicationContext;
import com.niit.demo.model.Employee;
import com.niit.demo.service.EmployeeService;
import com.niit.demo.service.EmployeeServiceImplmt;

import sun.awt.AppContext;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)

public class EmployeeTest {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@Before
	public void setup()
	{
	}
	
	@After
	public void teardown()
	{
		
		
	}
	
	@Test
	public void testAddEmployee()
	{
		Employee employ= new Employee();
		employ.setEmpName("Manmeet");
		employ.setEmail("manmeet123@gmail.com");
		
		assertEquals(true, employeeService.addEmployee(employ));
	}
	/*
	@Test(expected=ConstraintViolationException.class)
	public void testAddEmployeeFailure() {
		
		if(employeeService.findByName("Manmeet")!= null)
		{
			employeeService.deleteEmployee(employeeService.findByName("Manmeet").getEmpId());
		}
		
		if(employeeService.findByName("Sonal")!=null) {
			employeeService.deleteEmployee(employeeService.findByName("Sonal").getEmpId());
		}
		
		Employee emp1=new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("Manmeet");
		emp1.setEmail("manmeet@gmail.com");
		emp1.setPassword("1234");
		emp1.setContactNo("8288856498");
		employeeService.addEmployee(emp1);
		
		
		Employee emp2=new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("Sonal");
		emp2.setEmail("sonal@gmail.com");
		emp2.setPassword("12345");
		emp2.setContactNo("1234567890");
		employeeService.addEmployee(emp2);
		
		assertEquals(false, employeeService.addEmployee(emp1));
		assertEquals(false, employeeService.addEmployee(emp2));
				
	}
	*/

}
