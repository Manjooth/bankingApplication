/* (C)2021 */
package com.banking.bankingApplication.controllers;

import com.banking.bankingApplication.models.Customer;
import com.banking.bankingApplication.repositories.CustomerRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
// @RequestMapping(path = "/customer")
public class CustomerController {

    private static List<Customer> allCustomers;

    @Autowired CustomerRepository customerRepository;

    @GetMapping(path = "/customers")
    public String getAllCustomers(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "customers";
    }

    @GetMapping(path = "findByMiddleName/{middleName}")
    @ResponseBody
    public List<Customer> getCustomerByLastName(@PathVariable String middleName) {
        allCustomers = customerRepository.findAll();
        return allCustomers.stream()
                .filter(
                        customer ->
                                customer.getMname() != null
                                        && customer.getMname().equals(middleName))
                .collect(Collectors.toList());
    }

    @GetMapping(path = "findById/{custId}")
    @ResponseBody
    public Optional<Customer> getCustomerById(@PathVariable String custId) {
        return customerRepository.findById(custId);
    }

    @GetMapping(path = "findByOccupation/{job}")
    @ResponseBody
    public List<Customer> getCustomerByOccupation(@PathVariable String job) {
        allCustomers = customerRepository.findAll();
        return allCustomers.stream()
                .filter(customer -> customer.getOccupation().equals(job))
                .collect(Collectors.toList());
    }
}
