package com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.repo;

import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IAddrepo extends JpaRepository<Address,Long> {
}
