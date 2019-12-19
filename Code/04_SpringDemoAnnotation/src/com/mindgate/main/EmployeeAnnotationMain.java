package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Employee;

public class EmployeeAnnotationMain {

	public static void main(String[] args) {

		System.out.println("Starting Main");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("All Objects are created !!");

		Employee employee = applicationContext.getBean("emp", Employee.class);
		System.out.println(employee);

	}
}
