package com.arjun.spring.springjdbc.employee.dao;

import com.arjun.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {

	int create(Employee employee);

	int update(Employee employee);

	int delete(int id);

	Employee read(int id);
}
