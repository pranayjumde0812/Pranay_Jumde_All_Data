package com.javaguides.springboot.service;

import com.javaguides.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
