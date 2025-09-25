package com.pagination.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pagination.entity.Employee;
import com.pagination.repository.EmployeeRepository;
import com.pagination.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
@Autowired
EmployeeRepository repository;

	@Override
	public Page<Employee> getEmployees(int pageIndex) {
		Pageable pageable=PageRequest.of(pageIndex, 3, Sort.by("sal"));
		return repository.findAll(pageable);
	}
}
