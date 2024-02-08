package com.relationship.relationshiprestapplication.repository;

import com.relationship.relationshiprestapplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
