package com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.repo;

import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IEmprepo extends JpaRepository<Employee,Long> {
}
