package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		// Employee employee = new Employee(101, "Test Employee", 10000);

		// Inject Object from spring

		ApplicationContext context = new ClassPathXmlApplicationContext("C:\\Training\\Spring\\Mindgate\\02_SpringDemo\\src");
		
		Employee employee =  context.getBean("employee" ,Employee.class);
		
		System.out.println(employee);

	}

}
