package com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.controller;


import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.model.Address;
import com.geekster.EMPLOYEE_ADDRESS_APPLIICATION.service.Addressservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    Addressservice addressservice;
    @PostMapping("Addresses")
    public String addaddress(@RequestBody List<Address>  newaddress)
    {
        return addressservice.addAddresses(newaddress);
    }
    @GetMapping("addresses")
    public List<Address> getalladdress()
    {
        return addressservice.getAllAddresses();
    }
    @GetMapping("address/id/{id}")
    public Address getaddressbyid(@PathVariable Long id)
    {
        return addressservice.getAddressById(id);
    }
    @DeleteMapping("delete/address/id/{id}")
    public void deletebyid(Long id)
    {
       addressservice.deleteById(id);
    }
    @PutMapping("update/address/id/{id}")
    public Address updateaddress(@PathVariable Long id,@RequestBody Address updatedaddress)
    {
        return addressservice.updateAddress(id,updatedaddress);
    }



}
