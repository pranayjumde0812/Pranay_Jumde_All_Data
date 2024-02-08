package com.relationship.relationshiprestapplication.service.impl;

import com.relationship.relationshiprestapplication.entity.Employee;
import com.relationship.relationshiprestapplication.repository.EmployeeRepository;
import com.relationship.relationshiprestapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
@Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee find(Integer employeeId) {
        return null;
    }
}
