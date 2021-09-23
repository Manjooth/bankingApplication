package com.banking.bankingApplication.controllers;

import com.banking.bankingApplication.models.Customer;
import com.banking.bankingApplication.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/customer")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping(path="/{middleName}")
    public @ResponseBody List<Customer> getCustomerByLastName(@PathVariable String middleName){
        List<Customer> customers = new ArrayList<>();
        for(Customer cust : customerRepository.findAll()){
            if(cust.getMname() != null && cust.getMname().equals(middleName)){
                customers.add(cust);
            }
        }
        return customers;
    }

    @GetMapping(path="findById/{custId}")
    public @ResponseBody Optional<Customer> getCustomerById(@PathVariable String custId){
        return customerRepository.findById(custId);
    }
}
