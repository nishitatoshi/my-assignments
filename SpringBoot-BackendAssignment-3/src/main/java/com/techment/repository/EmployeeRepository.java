package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
