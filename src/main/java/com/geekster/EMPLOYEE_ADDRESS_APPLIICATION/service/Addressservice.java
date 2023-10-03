package com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.service;

import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.model.Address;
import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.repo.IAddrepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Addressservice {
    @Autowired
    IAddrepo iAddrepo;

    public String addAddresses(List<Address> newaddress) {
        iAddrepo.saveAll(newaddress);
                return "added";
    }

    public List<Address> getAllAddresses() {
        return iAddrepo.findAll();
    }

    public Address getAddressById(Long id) {
        return iAddrepo.findById(id).get();
    }

    public void deleteById(Long id) {
      iAddrepo.deleteById(id);
    }

    public Address updateAddress(Long id, Address updatedaddress) {
       Address existingAddress = iAddrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Event not found"));

        // Update the fields of the existing event with the values from the updated event
        existingAddress.setStreet(updatedaddress.getStreet());
        existingAddress .setCity(updatedaddress.getCity());
        existingAddress .setState(updatedaddress.getState());
        existingAddress .setZipcode(updatedaddress.getZipcode());


        // Save the updated event
        return iAddrepo.save(existingAddress);

    }
}
