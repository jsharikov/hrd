package com.epam.hrd.service;

import com.epam.hrd.domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    void save(Employee employee);

    Employee get(Long id);

    void delete(Long id);
}
