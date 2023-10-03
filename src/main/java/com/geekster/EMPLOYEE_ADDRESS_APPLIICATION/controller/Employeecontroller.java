package com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.controller;


import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.model.Employee;
import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employeecontroller {
    @Autowired
    Employeeservice employeeservice;
    @PostMapping("employees")
    public String addemployee( @RequestBody List<Employee> newemployee)
    {
        return employeeservice.addEmployees(newemployee);
    }
    @GetMapping("employees")
    public List<Employee> getaddemployees()
    {
        return employeeservice.getAllEmployees();
    }
    @GetMapping("employee/id/{id}")
    public Employee getemployeebyid(@PathVariable Long id)
    {
        return employeeservice.getEmployeeById(id);
    }
    @DeleteMapping("delete/employee/id/{id}")
    public void deletebyid(@PathVariable Long id)
    {
        employeeservice.deleteEmployeeByID(id);
    }
    @PutMapping("update/id/{id}")
    public Employee updateemployee(@PathVariable Long id,@RequestBody Employee updatedemployee)
    {
        return employeeservice.updateEmployee(id,updatedemployee);
    }



}
