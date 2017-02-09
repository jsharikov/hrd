package com.epam.hrd.rest.resource;

import com.epam.hrd.domain.Employee;
import com.epam.hrd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> list() {
        return employeeService.getAll();
    }

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public Employee read(@PathVariable Long id) {
        return employeeService.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Employee employee) {
        employeeService.save(employee);
    }

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.PUT)
    public void update(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        employeeService.save(employee);
    }

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        employeeService.delete(id);
    }
}
