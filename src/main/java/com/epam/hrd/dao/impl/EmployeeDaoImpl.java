package com.epam.hrd.dao.impl;

import com.epam.hrd.dao.EmployeeDao;
import com.epam.hrd.domain.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Employee e").list();
    }

    @Override
    public void create(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public Employee read(Long id) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @Override
    public void update(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
    }

    @Override
    public void delete(Long id) {
        Employee employee = read(id);
        if (employee != null) {
            sessionFactory.getCurrentSession().delete(employee);
        }
    }
}
