package com.pagination.service;

import com.pagination.entity.Employee;
import org.springframework.data.domain.Page;

public interface IEmployeeService {
    Page<Employee> getEmployees(int pageIndex);
}
