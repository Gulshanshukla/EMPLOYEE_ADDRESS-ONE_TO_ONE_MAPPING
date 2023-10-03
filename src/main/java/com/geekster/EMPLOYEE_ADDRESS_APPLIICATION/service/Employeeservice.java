package com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.service;

import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.exception.EntityNotFoundException;
import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.model.Employee;
import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.repo.IEmprepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Employeeservice {
    @Autowired
    IEmprepo iEmprepo;

    public String addEmployees(List<Employee> newemployee) {
        iEmprepo.saveAll(newemployee);
        return "added";
    }

    public List<Employee> getAllEmployees() {
        return iEmprepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return iEmprepo.findById(id).get();
    }

    public void deleteEmployeeByID(Long id) {
        iEmprepo.deleteById(id);
    }

    public Employee updateEmployee(Long id, Employee updatedemployee) {
        Employee existingEmployee=iEmprepo.findById(id)
                 .orElseThrow(() -> new EntityNotFoundException("Event not found"));
        existingEmployee.setFirstName(updatedemployee.getFirstName());
        existingEmployee .setLastName(updatedemployee.getLastName());
        existingEmployee .setAddress(updatedemployee.getAddress());
       // existingAddress .setZipcode(updatedaddress.getZipcode());


        // Save the updated event
        return iEmprepo.save(existingEmployee);
    }
}
