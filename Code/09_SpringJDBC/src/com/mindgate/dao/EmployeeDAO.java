package com.mindgate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mindgate.pojo.Employee;

@Component("employeeDAO")
public class EmployeeDAO {

	@Autowired
	private DataSource dataSource;

	private String query;
	private int count;

	public List<Employee> getAllEmployees() {

		query = "select * from employee_master";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		List<Employee> employeeList = new ArrayList<Employee>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);

		for (Map<String, Object> map : rows) {
			Employee employee = new Employee();
			employee.setEmployeeId(Integer.parseInt(map.get("employeeId").toString()));
			employee.setName(map.get("name").toString());
			employee.setSalary(Double.parseDouble(map.get("salary").toString()));
			employeeList.add(employee);
		}

		return employeeList;
	}

	public Employee getEmployee(int employeeId) {
		query = "select * from employee_master where employeeId = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { employeeId };

		Employee employee = jdbcTemplate.queryForObject(query, args, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet resultSet, int arg1) throws SQLException {
				Employee employee = new Employee();
				employee.setEmployeeId(resultSet.getInt("employeeId"));
				employee.setName(resultSet.getString("name"));
				employee.setSalary(resultSet.getDouble("salary"));
				return employee;
			}
		});

		return employee;
	}

	public void deleteEmployee(int employeeId) {
		query = "delete from employee_master where employeeId = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { employeeId };

		count = jdbcTemplate.update(query, args);

		System.out.println("Delete Count :: " + count);

	}

	public void addEmployee(Employee employee) {

		query = "insert into employee_master values(?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { employee.getEmployeeId(), employee.getName(), employee.getSalary() };

		count = jdbcTemplate.update(query, args);

	}

	public void updateEmployeeSalary(int employeeId, double salary) {
		query = "update employee_master set salary = ? where employeeId = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { salary, employeeId };

		count = jdbcTemplate.update(query, args);

		System.out.println("Update Count :: " + count);

	}

}
