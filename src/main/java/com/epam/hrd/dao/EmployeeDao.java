package com.epam.hrd.dao;

import com.epam.hrd.domain.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    void create(Employee employee);

    Employee read(Long id);

    void update(Employee employee);

    void delete(Long id);
}
