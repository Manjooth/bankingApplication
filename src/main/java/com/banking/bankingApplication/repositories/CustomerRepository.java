package com.banking.bankingApplication.repositories;

import com.banking.bankingApplication.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
}
