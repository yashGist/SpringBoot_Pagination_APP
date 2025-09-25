package com.pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pagination.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
