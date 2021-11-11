/* (C)2021 */
package com.banking.bankingApplication.repositories;

import com.banking.bankingApplication.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {}
