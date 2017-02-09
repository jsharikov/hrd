package com.epam.hrd.service.impl;

import com.epam.hrd.dao.EmployeeDao;
import com.epam.hrd.domain.Employee;
import com.epam.hrd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAll() {
        return employeeDao.findAll();
    }

    @Override
    public void save(Employee employee) {
        if (employee.getId() == null) {
            employeeDao.create(employee);
        } else {
            employeeDao.update(employee);
        }
    }

    @Override
    public Employee get(Long id) {
        return employeeDao.read(id);
    }

    @Override
    public void delete(Long id) {
        employeeDao.delete(id);
    }
}
